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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.cat.segments;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.segments.SegmentsRecord

/**
 *
 * @see <a href="../../doc-files/api-spec.html#cat.segments.SegmentsRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class SegmentsRecord implements JsonpSerializable {
	@Nullable
	private final String index;

	@Nullable
	private final String shard;

	@Nullable
	private final String prirep;

	@Nullable
	private final String ip;

	@Nullable
	private final String id;

	@Nullable
	private final String segment;

	@Nullable
	private final String generation;

	@Nullable
	private final String docsCount;

	@Nullable
	private final String docsDeleted;

	@Nullable
	private final String size;

	@Nullable
	private final String sizeMemory;

	@Nullable
	private final String committed;

	@Nullable
	private final String searchable;

	@Nullable
	private final String version;

	@Nullable
	private final String compound;

	// ---------------------------------------------------------------------------------------------

	private SegmentsRecord(Builder builder) {

		this.index = builder.index;
		this.shard = builder.shard;
		this.prirep = builder.prirep;
		this.ip = builder.ip;
		this.id = builder.id;
		this.segment = builder.segment;
		this.generation = builder.generation;
		this.docsCount = builder.docsCount;
		this.docsDeleted = builder.docsDeleted;
		this.size = builder.size;
		this.sizeMemory = builder.sizeMemory;
		this.committed = builder.committed;
		this.searchable = builder.searchable;
		this.version = builder.version;
		this.compound = builder.compound;

	}

	public static SegmentsRecord of(Function<Builder, ObjectBuilder<SegmentsRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The index name.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * The shard name.
	 * <p>
	 * API name: {@code shard}
	 */
	@Nullable
	public final String shard() {
		return this.shard;
	}

	/**
	 * The shard type: <code>primary</code> or <code>replica</code>.
	 * <p>
	 * API name: {@code prirep}
	 */
	@Nullable
	public final String prirep() {
		return this.prirep;
	}

	/**
	 * The IP address of the node where it lives.
	 * <p>
	 * API name: {@code ip}
	 */
	@Nullable
	public final String ip() {
		return this.ip;
	}

	/**
	 * The unique identifier of the node where it lives.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * The segment name, which is derived from the segment generation and used
	 * internally to create file names in the directory of the shard.
	 * <p>
	 * API name: {@code segment}
	 */
	@Nullable
	public final String segment() {
		return this.segment;
	}

	/**
	 * The segment generation number. Elasticsearch increments this generation
	 * number for each segment written then uses this number to derive the segment
	 * name.
	 * <p>
	 * API name: {@code generation}
	 */
	@Nullable
	public final String generation() {
		return this.generation;
	}

	/**
	 * The number of documents in the segment. This excludes deleted documents and
	 * counts any nested documents separately from their parents. It also excludes
	 * documents which were indexed recently and do not yet belong to a segment.
	 * <p>
	 * API name: {@code docs.count}
	 */
	@Nullable
	public final String docsCount() {
		return this.docsCount;
	}

	/**
	 * The number of deleted documents in the segment, which might be higher or
	 * lower than the number of delete operations you have performed. This number
	 * excludes deletes that were performed recently and do not yet belong to a
	 * segment. Deleted documents are cleaned up by the automatic merge process if
	 * it makes sense to do so. Also, Elasticsearch creates extra deleted documents
	 * to internally track the recent history of operations on a shard.
	 * <p>
	 * API name: {@code docs.deleted}
	 */
	@Nullable
	public final String docsDeleted() {
		return this.docsDeleted;
	}

	/**
	 * The segment size in bytes.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final String size() {
		return this.size;
	}

	/**
	 * The segment memory in bytes. A value of <code>-1</code> indicates
	 * Elasticsearch was unable to compute this number.
	 * <p>
	 * API name: {@code size.memory}
	 */
	@Nullable
	public final String sizeMemory() {
		return this.sizeMemory;
	}

	/**
	 * If <code>true</code>, the segment is synced to disk. Segments that are synced
	 * can survive a hard reboot. If <code>false</code>, the data from uncommitted
	 * segments is also stored in the transaction log so that Elasticsearch is able
	 * to replay changes on the next start.
	 * <p>
	 * API name: {@code committed}
	 */
	@Nullable
	public final String committed() {
		return this.committed;
	}

	/**
	 * If <code>true</code>, the segment is searchable. If <code>false</code>, the
	 * segment has most likely been written to disk but needs a refresh to be
	 * searchable.
	 * <p>
	 * API name: {@code searchable}
	 */
	@Nullable
	public final String searchable() {
		return this.searchable;
	}

	/**
	 * The version of Lucene used to write the segment.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * If <code>true</code>, the segment is stored in a compound file. This means
	 * Lucene merged all files from the segment in a single file to save file
	 * descriptors.
	 * <p>
	 * API name: {@code compound}
	 */
	@Nullable
	public final String compound() {
		return this.compound;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.shard != null) {
			generator.writeKey("shard");
			generator.write(this.shard);

		}
		if (this.prirep != null) {
			generator.writeKey("prirep");
			generator.write(this.prirep);

		}
		if (this.ip != null) {
			generator.writeKey("ip");
			generator.write(this.ip);

		}
		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.segment != null) {
			generator.writeKey("segment");
			generator.write(this.segment);

		}
		if (this.generation != null) {
			generator.writeKey("generation");
			generator.write(this.generation);

		}
		if (this.docsCount != null) {
			generator.writeKey("docs.count");
			generator.write(this.docsCount);

		}
		if (this.docsDeleted != null) {
			generator.writeKey("docs.deleted");
			generator.write(this.docsDeleted);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.sizeMemory != null) {
			generator.writeKey("size.memory");
			generator.write(this.sizeMemory);

		}
		if (this.committed != null) {
			generator.writeKey("committed");
			generator.write(this.committed);

		}
		if (this.searchable != null) {
			generator.writeKey("searchable");
			generator.write(this.searchable);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.compound != null) {
			generator.writeKey("compound");
			generator.write(this.compound);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SegmentsRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SegmentsRecord> {
		@Nullable
		private String index;

		@Nullable
		private String shard;

		@Nullable
		private String prirep;

		@Nullable
		private String ip;

		@Nullable
		private String id;

		@Nullable
		private String segment;

		@Nullable
		private String generation;

		@Nullable
		private String docsCount;

		@Nullable
		private String docsDeleted;

		@Nullable
		private String size;

		@Nullable
		private String sizeMemory;

		@Nullable
		private String committed;

		@Nullable
		private String searchable;

		@Nullable
		private String version;

		@Nullable
		private String compound;

		/**
		 * The index name.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * The shard name.
		 * <p>
		 * API name: {@code shard}
		 */
		public final Builder shard(@Nullable String value) {
			this.shard = value;
			return this;
		}

		/**
		 * The shard type: <code>primary</code> or <code>replica</code>.
		 * <p>
		 * API name: {@code prirep}
		 */
		public final Builder prirep(@Nullable String value) {
			this.prirep = value;
			return this;
		}

		/**
		 * The IP address of the node where it lives.
		 * <p>
		 * API name: {@code ip}
		 */
		public final Builder ip(@Nullable String value) {
			this.ip = value;
			return this;
		}

		/**
		 * The unique identifier of the node where it lives.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * The segment name, which is derived from the segment generation and used
		 * internally to create file names in the directory of the shard.
		 * <p>
		 * API name: {@code segment}
		 */
		public final Builder segment(@Nullable String value) {
			this.segment = value;
			return this;
		}

		/**
		 * The segment generation number. Elasticsearch increments this generation
		 * number for each segment written then uses this number to derive the segment
		 * name.
		 * <p>
		 * API name: {@code generation}
		 */
		public final Builder generation(@Nullable String value) {
			this.generation = value;
			return this;
		}

		/**
		 * The number of documents in the segment. This excludes deleted documents and
		 * counts any nested documents separately from their parents. It also excludes
		 * documents which were indexed recently and do not yet belong to a segment.
		 * <p>
		 * API name: {@code docs.count}
		 */
		public final Builder docsCount(@Nullable String value) {
			this.docsCount = value;
			return this;
		}

		/**
		 * The number of deleted documents in the segment, which might be higher or
		 * lower than the number of delete operations you have performed. This number
		 * excludes deletes that were performed recently and do not yet belong to a
		 * segment. Deleted documents are cleaned up by the automatic merge process if
		 * it makes sense to do so. Also, Elasticsearch creates extra deleted documents
		 * to internally track the recent history of operations on a shard.
		 * <p>
		 * API name: {@code docs.deleted}
		 */
		public final Builder docsDeleted(@Nullable String value) {
			this.docsDeleted = value;
			return this;
		}

		/**
		 * The segment size in bytes.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable String value) {
			this.size = value;
			return this;
		}

		/**
		 * The segment memory in bytes. A value of <code>-1</code> indicates
		 * Elasticsearch was unable to compute this number.
		 * <p>
		 * API name: {@code size.memory}
		 */
		public final Builder sizeMemory(@Nullable String value) {
			this.sizeMemory = value;
			return this;
		}

		/**
		 * If <code>true</code>, the segment is synced to disk. Segments that are synced
		 * can survive a hard reboot. If <code>false</code>, the data from uncommitted
		 * segments is also stored in the transaction log so that Elasticsearch is able
		 * to replay changes on the next start.
		 * <p>
		 * API name: {@code committed}
		 */
		public final Builder committed(@Nullable String value) {
			this.committed = value;
			return this;
		}

		/**
		 * If <code>true</code>, the segment is searchable. If <code>false</code>, the
		 * segment has most likely been written to disk but needs a refresh to be
		 * searchable.
		 * <p>
		 * API name: {@code searchable}
		 */
		public final Builder searchable(@Nullable String value) {
			this.searchable = value;
			return this;
		}

		/**
		 * The version of Lucene used to write the segment.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * If <code>true</code>, the segment is stored in a compound file. This means
		 * Lucene merged all files from the segment in a single file to save file
		 * descriptors.
		 * <p>
		 * API name: {@code compound}
		 */
		public final Builder compound(@Nullable String value) {
			this.compound = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SegmentsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SegmentsRecord build() {
			_checkSingleUse();

			return new SegmentsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SegmentsRecord}
	 */
	public static final JsonpDeserializer<SegmentsRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SegmentsRecord::setupSegmentsRecordDeserializer);

	protected static void setupSegmentsRecordDeserializer(ObjectDeserializer<SegmentsRecord.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index", "i", "idx");
		op.add(Builder::shard, JsonpDeserializer.stringDeserializer(), "shard", "s", "sh");
		op.add(Builder::prirep, JsonpDeserializer.stringDeserializer(), "prirep", "p", "pr", "primaryOrReplica");
		op.add(Builder::ip, JsonpDeserializer.stringDeserializer(), "ip");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::segment, JsonpDeserializer.stringDeserializer(), "segment", "seg");
		op.add(Builder::generation, JsonpDeserializer.stringDeserializer(), "generation", "g", "gen");
		op.add(Builder::docsCount, JsonpDeserializer.stringDeserializer(), "docs.count", "dc", "docsCount");
		op.add(Builder::docsDeleted, JsonpDeserializer.stringDeserializer(), "docs.deleted", "dd", "docsDeleted");
		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size", "si");
		op.add(Builder::sizeMemory, JsonpDeserializer.stringDeserializer(), "size.memory", "sm", "sizeMemory");
		op.add(Builder::committed, JsonpDeserializer.stringDeserializer(), "committed", "ic", "isCommitted");
		op.add(Builder::searchable, JsonpDeserializer.stringDeserializer(), "searchable", "is", "isSearchable");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version", "v");
		op.add(Builder::compound, JsonpDeserializer.stringDeserializer(), "compound", "ico", "isCompound");

	}

}
