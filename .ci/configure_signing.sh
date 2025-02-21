#!/usr/bin/env bash

#
# Licensed to Elasticsearch B.V. under one or more contributor
# license agreements. See the NOTICE file distributed with
# this work for additional information regarding copyright
# ownership. Elasticsearch B.V. licenses this file to you under
# the Apache License, Version 2.0 (the "License"); you may
# not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
#

#see https://central.sonatype.org/publish/publish-gradle/#distributing-your-public-key

set -euo pipefail

if grep -sq "signing.keyId" gradle.properties; then
  # Keys already present
  exit 0
fi

mkdir -p /tmp/secured
keyring_file="/tmp/secured/keyring.gpg"

vault_path="kv/ci-shared/release-eng/team-release-secrets/elasticsearch-java"

vault kv get --field="keyring" $vault_path/gpg | base64 -d > $keyring_file
## NOTE: passphase is the name of the field.
signing_password=$(vault kv get --field="passphase" $vault_path/gpg)
signing_key=$(vault kv get --field="key_id" $vault_path/gpg)

maven_username=$(vault kv get --field="username" $vault_path/maven_central)
maven_password=$(vault kv get --field="password" $vault_path/maven_central)

cat >> gradle.properties <<EOF
signing.keyId=${signing_key: -8}
signing.password=${signing_password}
signing.secretKeyRingFile=${keyring_file}

ossrhUsername=${maven_username}
ossrhPassword=${maven_password}
EOF

