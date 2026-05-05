/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 *
 * @see <a href="../doc-files/api-spec.html#cat._types.CatSnapshotsColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatSnapshotsColumn implements JsonEnum {
	/**
	 * The ID of the snapshot, such as 'snap1'.
	 */
	Id("id", "snapshot"),

	/**
	 * The name of the repository, such as 'repo1'.
	 */
	Repository("repository", "re", "repo"),

	/**
	 * State of the snapshot process. Returned values are: 'FAILED': The snapshot
	 * process failed. 'INCOMPATIBLE': The snapshot process is incompatible with the
	 * current cluster version. 'IN_PROGRESS': The snapshot process started but has
	 * not completed. 'PARTIAL': The snapshot process completed with a partial
	 * success. 'SUCCESS': The snapshot process completed with a full success.
	 */
	Status("status", "s"),

	/**
	 * The <a href="https://en.wikipedia.org/wiki/Unix_time">unix epoch time</a> at
	 * which the snapshot process started.
	 */
	StartEpoch("start_epoch", "ste", "startEpoch"),

	/**
	 * 'HH:MM:SS' time at which the snapshot process started.
	 */
	StartTime("start_time", "sti", "startTime"),

	/**
	 * The <a href="https://en.wikipedia.org/wiki/Unix_time">unix epoch time</a> at
	 * which the snapshot process ended.
	 */
	EndEpoch("end_epoch", "ete", "endEpoch"),

	/**
	 * 'HH:MM:SS' time at which the snapshot process ended.
	 */
	EndTime("end_time", "eti", "endTime"),

	/**
	 * The time it took the snapshot process to complete in <a href=
	 * "https://www.elastic.co/docs/reference/elasticsearch/rest-apis/api-conventions#time-units">time
	 * units</a>.
	 */
	Duration("duration", "dur"),

	/**
	 * The number of indices in the snapshot.
	 */
	Indices("indices", "i"),

	/**
	 * The number of successful shards in the snapshot.
	 */
	SuccessfulShards("successful_shards", "ss"),

	/**
	 * The number of failed shards in the snapshot.
	 */
	FailedShards("failed_shards", "fs"),

	/**
	 * The total number of shards in the snapshot.
	 */
	TotalShards("total_shards", "ts"),

	/**
	 * The reason for any snapshot failures.
	 */
	Reason("reason", "r"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatSnapshotsColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatSnapshotsColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatSnapshotsColumn.values());
}
