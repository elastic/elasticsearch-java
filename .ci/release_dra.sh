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

set -euo pipefail

WORKFLOW=$1
STACK_VERSION=$(cat config/version.txt)

# Branch: BRANCH env var > Buildkite's BUILDKITE_BRANCH var > minor version
BRANCH=${BRANCH:-${BUILDKITE_BRANCH:-${STACK_VERSION%.*}}}

if [[ "$BRANCH" = "main" && "$WORKFLOW" = "staging" ]]; then
  echo "No staging build for the main branch - skipping"
  exit 0
fi

# Add snapshot suffix if needed
BUILD_VERSION=$STACK_VERSION
[ "$WORKFLOW" = "snapshot" ] && BUILD_VERSION="${BUILD_VERSION}-SNAPSHOT"

echo "Releasing version $STACK_VERSION, branch: $BRANCH, workflow: $WORKFLOW"

DRA_CREDS=$(vault kv get -field=data -format=json kv/ci-shared/release/dra-role)

.ci/make.sh assemble "$BUILD_VERSION"

# set required permissions on artifacts and directory
chmod -R a+r $PWD/.ci/output/*
chmod -R a+w $PWD/.ci/output
# Artifacts should be generated
docker run --rm \
       --name release-manager \
       -e VAULT_ADDR="$(echo "$DRA_CREDS" | jq -r '.vault_addr')" \
       -e VAULT_ROLE_ID="$(echo "$DRA_CREDS" | jq -r '.role_id')" \
       -e VAULT_SECRET_ID="$(echo "$DRA_CREDS" | jq -r '.secret_id')" \
       --mount type=bind,readonly=false,src="$PWD",target=/artifacts \
       docker.elastic.co/infra/release-manager:latest \
       cli collect \
       --project elasticsearch-java \
       --branch "$BRANCH" \
       --commit "$(git rev-parse HEAD)" \
       --workflow "$WORKFLOW" \
       --version "$STACK_VERSION" \
       --artifact-set main
