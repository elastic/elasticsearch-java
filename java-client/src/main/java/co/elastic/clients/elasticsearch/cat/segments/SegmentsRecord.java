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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: cat.segments.SegmentsRecord
public final class SegmentsRecord implements ToJsonp {
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
	private final String docs_count;

	@Nullable
	private final String docs_deleted;

	@Nullable
	private final JsonValue size;

	@Nullable
	private final JsonValue size_memory;

	@Nullable
	private final String committed;

	@Nullable
	private final String searchable;

	@Nullable
	private final String version;

	@Nullable
	private final String compound;

	// ---------------------------------------------------------------------------------------------

	protected SegmentsRecord(Builder builder) {

		this.index = builder.index;
		this.shard = builder.shard;
		this.prirep = builder.prirep;
		this.ip = builder.ip;
		this.id = builder.id;
		this.segment = builder.segment;
		this.generation = builder.generation;
		this.docs_count = builder.docs_count;
		this.docs_deleted = builder.docs_deleted;
		this.size = builder.size;
		this.size_memory = builder.size_memory;
		this.committed = builder.committed;
		this.searchable = builder.searchable;
		this.version = builder.version;
		this.compound = builder.compound;

	}

	/**
	 * index name
	 *
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * shard name
	 *
	 * API name: {@code shard}
	 */
	@Nullable
	public String shard() {
		return this.shard;
	}

	/**
	 * primary or replica
	 *
	 * API name: {@code prirep}
	 */
	@Nullable
	public String prirep() {
		return this.prirep;
	}

	/**
	 * ip of node where it lives
	 *
	 * API name: {@code ip}
	 */
	@Nullable
	public String ip() {
		return this.ip;
	}

	/**
	 * unique id of node where it lives
	 *
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * segment name
	 *
	 * API name: {@code segment}
	 */
	@Nullable
	public String segment() {
		return this.segment;
	}

	/**
	 * segment generation
	 *
	 * API name: {@code generation}
	 */
	@Nullable
	public String generation() {
		return this.generation;
	}

	/**
	 * number of docs in segment
	 *
	 * API name: {@code docs.count}
	 */
	@Nullable
	public String docs_count() {
		return this.docs_count;
	}

	/**
	 * number of deleted docs in segment
	 *
	 * API name: {@code docs.deleted}
	 */
	@Nullable
	public String docs_deleted() {
		return this.docs_deleted;
	}

	/**
	 * segment size in bytes
	 *
	 * API name: {@code size}
	 */
	@Nullable
	public JsonValue size() {
		return this.size;
	}

	/**
	 * segment memory in bytes
	 *
	 * API name: {@code size.memory}
	 */
	@Nullable
	public JsonValue size_memory() {
		return this.size_memory;
	}

	/**
	 * is segment committed
	 *
	 * API name: {@code committed}
	 */
	@Nullable
	public String committed() {
		return this.committed;
	}

	/**
	 * is segment searched
	 *
	 * API name: {@code searchable}
	 */
	@Nullable
	public String searchable() {
		return this.searchable;
	}

	/**
	 * version
	 *
	 * API name: {@code version}
	 */
	@Nullable
	public String version() {
		return this.version;
	}

	/**
	 * is segment compound
	 *
	 * API name: {@code compound}
	 */
	@Nullable
	public String compound() {
		return this.compound;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

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
		if (this.docs_count != null) {

			generator.writeKey("docs.count");
			generator.write(this.docs_count);

		}
		if (this.docs_deleted != null) {

			generator.writeKey("docs.deleted");
			generator.write(this.docs_deleted);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.size_memory != null) {

			generator.writeKey("size.memory");
			generator.write(this.size_memory);

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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SegmentsRecord}.
	 */
	public static class Builder implements ObjectBuilder<SegmentsRecord> {
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
		private String docs_count;

		@Nullable
		private String docs_deleted;

		@Nullable
		private JsonValue size;

		@Nullable
		private JsonValue size_memory;

		@Nullable
		private String committed;

		@Nullable
		private String searchable;

		@Nullable
		private String version;

		@Nullable
		private String compound;

		/**
		 * index name
		 *
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * shard name
		 *
		 * API name: {@code shard}
		 */
		public Builder shard(@Nullable String value) {
			this.shard = value;
			return this;
		}

		/**
		 * primary or replica
		 *
		 * API name: {@code prirep}
		 */
		public Builder prirep(@Nullable String value) {
			this.prirep = value;
			return this;
		}

		/**
		 * ip of node where it lives
		 *
		 * API name: {@code ip}
		 */
		public Builder ip(@Nullable String value) {
			this.ip = value;
			return this;
		}

		/**
		 * unique id of node where it lives
		 *
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * segment name
		 *
		 * API name: {@code segment}
		 */
		public Builder segment(@Nullable String value) {
			this.segment = value;
			return this;
		}

		/**
		 * segment generation
		 *
		 * API name: {@code generation}
		 */
		public Builder generation(@Nullable String value) {
			this.generation = value;
			return this;
		}

		/**
		 * number of docs in segment
		 *
		 * API name: {@code docs.count}
		 */
		public Builder docs_count(@Nullable String value) {
			this.docs_count = value;
			return this;
		}

		/**
		 * number of deleted docs in segment
		 *
		 * API name: {@code docs.deleted}
		 */
		public Builder docs_deleted(@Nullable String value) {
			this.docs_deleted = value;
			return this;
		}

		/**
		 * segment size in bytes
		 *
		 * API name: {@code size}
		 */
		public Builder size(@Nullable JsonValue value) {
			this.size = value;
			return this;
		}

		/**
		 * segment memory in bytes
		 *
		 * API name: {@code size.memory}
		 */
		public Builder size_memory(@Nullable JsonValue value) {
			this.size_memory = value;
			return this;
		}

		/**
		 * is segment committed
		 *
		 * API name: {@code committed}
		 */
		public Builder committed(@Nullable String value) {
			this.committed = value;
			return this;
		}

		/**
		 * is segment searched
		 *
		 * API name: {@code searchable}
		 */
		public Builder searchable(@Nullable String value) {
			this.searchable = value;
			return this;
		}

		/**
		 * version
		 *
		 * API name: {@code version}
		 */
		public Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * is segment compound
		 *
		 * API name: {@code compound}
		 */
		public Builder compound(@Nullable String value) {
			this.compound = value;
			return this;
		}

		/**
		 * Builds a {@link SegmentsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SegmentsRecord build() {

			return new SegmentsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SegmentsRecord
	 */
	public static final JsonpDeserializer<SegmentsRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SegmentsRecord::setupSegmentsRecordDeserializer);

	protected static void setupSegmentsRecordDeserializer(DelegatingDeserializer<SegmentsRecord.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index", "i", "idx");
		op.add(Builder::shard, JsonpDeserializer.stringDeserializer(), "shard", "s", "sh");
		op.add(Builder::prirep, JsonpDeserializer.stringDeserializer(), "prirep", "p", "pr", "primaryOrReplica");
		op.add(Builder::ip, JsonpDeserializer.stringDeserializer(), "ip");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::segment, JsonpDeserializer.stringDeserializer(), "segment", "seg");
		op.add(Builder::generation, JsonpDeserializer.stringDeserializer(), "generation", "g", "gen");
		op.add(Builder::docs_count, JsonpDeserializer.stringDeserializer(), "docs.count", "dc", "docsCount");
		op.add(Builder::docs_deleted, JsonpDeserializer.stringDeserializer(), "docs.deleted", "dd", "docsDeleted");
		op.add(Builder::size, JsonpDeserializer.jsonValueDeserializer(), "size", "si");
		op.add(Builder::size_memory, JsonpDeserializer.jsonValueDeserializer(), "size.memory", "sm", "sizeMemory");
		op.add(Builder::committed, JsonpDeserializer.stringDeserializer(), "committed", "ic", "isCommitted");
		op.add(Builder::searchable, JsonpDeserializer.stringDeserializer(), "searchable", "is", "isSearchable");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version", "v");
		op.add(Builder::compound, JsonpDeserializer.stringDeserializer(), "compound", "ico", "isCompound");

	}

}
