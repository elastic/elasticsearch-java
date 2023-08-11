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

package co.elastic.clients.elasticsearch.core.bulk;

import co.elastic.clients.elasticsearch._types.VersionType;
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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.bulk.OperationBase

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.bulk.OperationBase">API
 *      specification</a>
 */

public abstract class BulkOperationBase implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final String index;

	@Nullable
	private final String routing;

	@Nullable
	private final Long ifPrimaryTerm;

	@Nullable
	private final Long ifSeqNo;

	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	// ---------------------------------------------------------------------------------------------

	protected BulkOperationBase(AbstractBuilder<?> builder) {

		this.id = builder.id;
		this.index = builder.index;
		this.routing = builder.routing;
		this.ifPrimaryTerm = builder.ifPrimaryTerm;
		this.ifSeqNo = builder.ifSeqNo;
		this.version = builder.version;
		this.versionType = builder.versionType;

	}

	/**
	 * API name: {@code _id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code _index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code if_primary_term}
	 */
	@Nullable
	public final Long ifPrimaryTerm() {
		return this.ifPrimaryTerm;
	}

	/**
	 * API name: {@code if_seq_no}
	 */
	@Nullable
	public final Long ifSeqNo() {
		return this.ifSeqNo;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * API name: {@code version_type}
	 */
	@Nullable
	public final VersionType versionType() {
		return this.versionType;
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

		if (this.id != null) {
			generator.writeKey("_id");
			generator.write(this.id);

		}
		if (this.index != null) {
			generator.writeKey("_index");
			generator.write(this.index);

		}
		if (this.routing != null) {
			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.ifPrimaryTerm != null) {
			generator.writeKey("if_primary_term");
			generator.write(this.ifPrimaryTerm);

		}
		if (this.ifSeqNo != null) {
			generator.writeKey("if_seq_no");
			generator.write(this.ifSeqNo);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.versionType != null) {
			generator.writeKey("version_type");
			this.versionType.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private String id;

		@Nullable
		private String index;

		@Nullable
		private String routing;

		@Nullable
		private Long ifPrimaryTerm;

		@Nullable
		private Long ifSeqNo;

		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

		/**
		 * API name: {@code _id}
		 */
		public final BuilderT id(@Nullable String value) {
			this.id = value;
			return self();
		}

		/**
		 * API name: {@code _index}
		 */
		public final BuilderT index(@Nullable String value) {
			this.index = value;
			return self();
		}

		/**
		 * API name: {@code routing}
		 */
		public final BuilderT routing(@Nullable String value) {
			this.routing = value;
			return self();
		}

		/**
		 * API name: {@code if_primary_term}
		 */
		public final BuilderT ifPrimaryTerm(@Nullable Long value) {
			this.ifPrimaryTerm = value;
			return self();
		}

		/**
		 * API name: {@code if_seq_no}
		 */
		public final BuilderT ifSeqNo(@Nullable Long value) {
			this.ifSeqNo = value;
			return self();
		}

		/**
		 * API name: {@code version}
		 */
		public final BuilderT version(@Nullable Long value) {
			this.version = value;
			return self();
		}

		/**
		 * API name: {@code version_type}
		 */
		public final BuilderT versionType(@Nullable VersionType value) {
			this.versionType = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupBulkOperationBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(AbstractBuilder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(AbstractBuilder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(AbstractBuilder::ifPrimaryTerm, JsonpDeserializer.longDeserializer(), "if_primary_term");
		op.add(AbstractBuilder::ifSeqNo, JsonpDeserializer.longDeserializer(), "if_seq_no");
		op.add(AbstractBuilder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(AbstractBuilder::versionType, VersionType._DESERIALIZER, "version_type");

	}

}
