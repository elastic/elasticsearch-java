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

export TMP_WORKSPACE=/tmp/secured
export KEY_FILE=$TMP_WORKSPACE"/private.key"

# Signing keys
GPG_SECRET=kv/ci-shared/release-eng/team-release-secrets/elasticsearch-java/gpg
vault kv get --field="keyring" $GPG_SECRET | base64 -d > $KEY_FILE
## NOTE: passphase is the name of the field.
KEYPASS_SECRET=$(vault kv get --field="passphase" $GPG_SECRET)
export KEYPASS_SECRET
KEY_ID=$(vault kv get --field="key_id" $GPG_SECRET)
KEY_ID_SECRET=${KEY_ID: -8}
export KEY_ID_SECRET

# Import the key into the keyring
echo "$KEYPASS_SECRET" | gpg --batch --import "$KEY_FILE"

# Export the key in ascii armored format
SECRING_ASC=$(gpg --pinentry-mode=loopback --passphrase "$KEYPASS_SECRET" --armor --export-secret-key "$KEY_ID_SECRET")
export SECRING_ASC

# Credentials
NEXUS_SECRET=kv/ci-shared/release-eng/team-release-secrets/elasticsearch-java/maven_central
maven_username=$(vault kv get --field="username" $NEXUS_SECRET)
maven_password=$(vault kv get --field="password" $NEXUS_SECRET)

ORG_GRADLE_PROJECT_sonatypeUsername=${maven_username}
export ORG_GRADLE_PROJECT_sonatypeUsername
ORG_GRADLE_PROJECT_sonatypePassword=${maven_password}
export ORG_GRADLE_PROJECT_sonatypePassword


