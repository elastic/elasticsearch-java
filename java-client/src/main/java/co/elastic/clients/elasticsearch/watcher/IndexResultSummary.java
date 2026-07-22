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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.Result;
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

// typedef: watcher._types.IndexResultSummary

/**
 * A single item of an index action result. Successful items and failed items
 * expose different fields; only <code>id</code> and <code>index</code> are
 * present in both. Failed items appear when a bulk index action ends in
 * <code>failure</code> or <code>partial_failure</code>.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.IndexResultSummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexResultSummary implements JsonpSerializable {
	private final String id;

	private final String index;

	@Nullable
	private final Boolean created;

	@Nullable
	private final Result result;

	@Nullable
	private final Long version;

	@Nullable
	private final Boolean failed;

	@Nullable
	private final String message;

	// ---------------------------------------------------------------------------------------------

	private IndexResultSummary(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.created = builder.created;
		this.result = builder.result;
		this.version = builder.version;
		this.failed = builder.failed;
		this.message = builder.message;

	}

	public static IndexResultSummary of(Function<Builder, ObjectBuilder<IndexResultSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code created}
	 */
	@Nullable
	public final Boolean created() {
		return this.created;
	}

	/**
	 * API name: {@code result}
	 */
	@Nullable
	public final Result result() {
		return this.result;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * Only present for failed items
	 * <p>
	 * API name: {@code failed}
	 */
	@Nullable
	public final Boolean failed() {
		return this.failed;
	}

	/**
	 * Only present for failed items
	 * <p>
	 * API name: {@code message}
	 */
	@Nullable
	public final String message() {
		return this.message;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("index");
		generator.write(this.index);

		if (this.created != null) {
			generator.writeKey("created");
			generator.write(this.created);

		}
		if (this.result != null) {
			generator.writeKey("result");
			this.result.serialize(generator, mapper);
		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.failed != null) {
			generator.writeKey("failed");
			generator.write(this.failed);

		}
		if (this.message != null) {
			generator.writeKey("message");
			generator.write(this.message);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexResultSummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexResultSummary> {
		private String id;

		private String index;

		@Nullable
		private Boolean created;

		@Nullable
		private Result result;

		@Nullable
		private Long version;

		@Nullable
		private Boolean failed;

		@Nullable
		private String message;

		public Builder() {
		}
		private Builder(IndexResultSummary instance) {
			this.id = instance.id;
			this.index = instance.index;
			this.created = instance.created;
			this.result = instance.result;
			this.version = instance.version;
			this.failed = instance.failed;
			this.message = instance.message;

		}
		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code created}
		 */
		public final Builder created(@Nullable Boolean value) {
			this.created = value;
			return this;
		}

		/**
		 * API name: {@code result}
		 */
		public final Builder result(@Nullable Result value) {
			this.result = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Only present for failed items
		 * <p>
		 * API name: {@code failed}
		 */
		public final Builder failed(@Nullable Boolean value) {
			this.failed = value;
			return this;
		}

		/**
		 * Only present for failed items
		 * <p>
		 * API name: {@code message}
		 */
		public final Builder message(@Nullable String value) {
			this.message = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexResultSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexResultSummary build() {
			_checkSingleUse();

			return new IndexResultSummary(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexResultSummary}
	 */
	public static final JsonpDeserializer<IndexResultSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexResultSummary::setupIndexResultSummaryDeserializer);

	protected static void setupIndexResultSummaryDeserializer(ObjectDeserializer<IndexResultSummary.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::created, JsonpDeserializer.booleanDeserializer(), "created");
		op.add(Builder::result, Result._DESERIALIZER, "result");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::failed, JsonpDeserializer.booleanDeserializer(), "failed");
		op.add(Builder::message, JsonpDeserializer.stringDeserializer(), "message");

	}

}
