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
 * @see <a href="../doc-files/api-spec.html#cat._types.CatSegmentsColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatSegmentsColumn implements JsonEnum {
	/**
	 * The name of the index.
	 */
	Index("index", "i", "idx"),

	/**
	 * The name of the shard.
	 */
	Shard("shard", "s", "sh"),

	/**
	 * The shard type. Returned values are 'primary' or 'replica'.
	 */
	Prirep("prirep", "p", "pr", "primaryOrReplica"),

	/**
	 * IP address of the segment’s shard, such as '127.0.1.1'.
	 */
	Ip("ip"),

	/**
	 * The name of the segment, such as '_0'. The segment name is derived from the
	 * segment generation and used internally to create file names in the directory
	 * of the shard.
	 */
	Segment("segment"),

	/**
	 * Generation number, such as '0'. Elasticsearch increments this generation
	 * number for each segment written. Elasticsearch then uses this number to
	 * derive the segment name.
	 */
	Generation("generation"),

	/**
	 * The number of documents as reported by Lucene. This excludes deleted
	 * documents and counts any <a href=
	 * "https://www.elastic.co/docs/reference/elasticsearch/mapping-reference/nested">nested
	 * documents</a> separately from their parents. It also excludes documents which
	 * were indexed recently and do not yet belong to a segment.
	 */
	DocsCount("docs.count"),

	/**
	 * The number of deleted documents as reported by Lucene, which may be higher or
	 * lower than the number of delete operations you have performed. This number
	 * excludes deletes that were performed recently and do not yet belong to a
	 * segment. Deleted documents are cleaned up by the <a href=
	 * "https://www.elastic.co/docs/reference/elasticsearch/index-settings/merge">automatic
	 * merge process</a> if it makes sense to do so. Also, Elasticsearch creates
	 * extra deleted documents to internally track the recent history of operations
	 * on a shard.
	 */
	DocsDeleted("docs.deleted"),

	/**
	 * The disk space used by the segment, such as '50kb'.
	 */
	Size("size"),

	/**
	 * The bytes of segment data stored in memory for efficient search, such as
	 * '1264'. A value of '-1' indicates Elasticsearch was unable to compute this
	 * number.
	 */
	SizeMemory("size.memory"),

	/**
	 * If 'true', the segments is synced to disk. Segments that are synced can
	 * survive a hard reboot. If 'false', the data from uncommitted segments is also
	 * stored in the transaction log so that Elasticsearch is able to replay changes
	 * on the next start.
	 */
	Committed("committed"),

	/**
	 * If 'true', the segment is searchable. If 'false', the segment has most likely
	 * been written to disk but needs a <a href=
	 * "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-indices-refresh">refresh</a>
	 * to be searchable.
	 */
	Searchable("searchable"),

	/**
	 * The version of Lucene used to write the segment.
	 */
	Version("version"),

	/**
	 * If 'true', the segment is stored in a compound file. This means Lucene merged
	 * all files from the segment in a single file to save file descriptors.
	 */
	Compound("compound"),

	/**
	 * The ID of the node, such as 'k0zy'.
	 */
	Id("id"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatSegmentsColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatSegmentsColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatSegmentsColumn.values());
}
