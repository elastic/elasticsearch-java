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

# The version in version.txt must be a prefix of the version to release.
repo_version="$(cat config/version.txt)"
if [[ ! "$VERSION" = $repo_version* ]]; then
  echo "Workflow version ($VERSION) and config/version.txt ($repo_version) do not match."
  exit 1
fi

.ci/configure_signing.sh

.ci/make.sh release $VERSION
