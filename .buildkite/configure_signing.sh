#!/bin/bash

#see https://central.sonatype.org/publish/publish-gradle/#distributing-your-public-key

set -e 

mkdir -p /tmp
keyring_file="/tmp/keyring.gpg"

vault kv get --field="keyring" kv/ci-shared/release-eng/team-release-secrets/elasticsearch-java/gpg | base64 -d > $keyring_file
signing_password=$(vault kv get --field="passphase" kv/ci-shared/release-eng/team-release-secrets/elasticsearch-java/gpg)
signing_key=$(vault kv get --field="key_id" kv/ci-shared/release-eng/team-release-secrets/elasticsearch-java/gpg)

maven_username=$(vault kv get --field="username" kv/ci-shared/release-eng/team-release-secrets/elasticsearch-java/maven_central)
maven_password=$(vault kv get --field="password" kv/ci-shared/release-eng/team-release-secrets/elasticsearch-java/maven_central)

cat > gradle.properties <<EOF
signing.keyId=${signing_key: -8}
signing.password=${signing_password}
signing.secretKeyRingFile=${keyring_file}

ossrhUsername=${maven_username}
ossrhPassword=${maven_password}
EOF

