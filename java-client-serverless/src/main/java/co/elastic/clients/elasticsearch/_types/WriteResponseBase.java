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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: _types.WriteResponseBase

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.WriteResponseBase">API
 *      specification</a>
 */

public abstract class WriteResponseBase implements JsonpSerializable {
	private final String id;

	private final String index;

	@Nullable
	private final Long primaryTerm;

	private final Result result;

	@Nullable
	private final Long seqNo;

	private final ShardStatistics shards;

	private final long version;

	@Nullable
	private final Boolean forcedRefresh;

	// ---------------------------------------------------------------------------------------------

	protected WriteResponseBase(AbstractBuilder<?> builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.primaryTerm = builder.primaryTerm;
		this.result = ApiTypeHelper.requireNonNull(builder.result, this, "result");
		this.seqNo = builder.seqNo;
		this.shards = ApiTypeHelper.requireNonNull(builder.shards, this, "shards");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");
		this.forcedRefresh = builder.forcedRefresh;

	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	@Nullable
	public final Long primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * Required - API name: {@code result}
	 */
	public final Result result() {
		return this.result;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	@Nullable
	public final Long seqNo() {
		return this.seqNo;
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code _version}
	 */
	public final long version() {
		return this.version;
	}

	/**
	 * API name: {@code forced_refresh}
	 */
	@Nullable
	public final Boolean forcedRefresh() {
		return this.forcedRefresh;
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

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_index");
		generator.write(this.index);

		if (this.primaryTerm != null) {
			generator.writeKey("_primary_term");
			generator.write(this.primaryTerm);

		}
		generator.writeKey("result");
		this.result.serialize(generator, mapper);
		if (this.seqNo != null) {
			generator.writeKey("_seq_no");
			generator.write(this.seqNo);

		}
		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		generator.writeKey("_version");
		generator.write(this.version);

		if (this.forcedRefresh != null) {
			generator.writeKey("forced_refresh");
			generator.write(this.forcedRefresh);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private String id;

		private String index;

		@Nullable
		private Long primaryTerm;

		private Result result;

		@Nullable
		private Long seqNo;

		private ShardStatistics shards;

		private Long version;

		@Nullable
		private Boolean forcedRefresh;

		/**
		 * Required - API name: {@code _id}
		 */
		public final BuilderT id(String value) {
			this.id = value;
			return self();
		}

		/**
		 * Required - API name: {@code _index}
		 */
		public final BuilderT index(String value) {
			this.index = value;
			return self();
		}

		/**
		 * API name: {@code _primary_term}
		 */
		public final BuilderT primaryTerm(@Nullable Long value) {
			this.primaryTerm = value;
			return self();
		}

		/**
		 * Required - API name: {@code result}
		 */
		public final BuilderT result(Result value) {
			this.result = value;
			return self();
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public final BuilderT seqNo(@Nullable Long value) {
			this.seqNo = value;
			return self();
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final BuilderT shards(ShardStatistics value) {
			this.shards = value;
			return self();
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final BuilderT shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code _version}
		 */
		public final BuilderT version(long value) {
			this.version = value;
			return self();
		}

		/**
		 * API name: {@code forced_refresh}
		 */
		public final BuilderT forcedRefresh(@Nullable Boolean value) {
			this.forcedRefresh = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupWriteResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(AbstractBuilder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(AbstractBuilder::primaryTerm, JsonpDeserializer.longDeserializer(), "_primary_term");
		op.add(AbstractBuilder::result, Result._DESERIALIZER, "result");
		op.add(AbstractBuilder::seqNo, JsonpDeserializer.longDeserializer(), "_seq_no");
		op.add(AbstractBuilder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(AbstractBuilder::version, JsonpDeserializer.longDeserializer(), "_version");
		op.add(AbstractBuilder::forcedRefresh, JsonpDeserializer.booleanDeserializer(), "forced_refresh");

	}

}
