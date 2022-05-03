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

package co.elastic.clients.elasticsearch.core.mtermvectors;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.elasticsearch.core.termvectors.TermVector;
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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.mtermvectors.TermVectorsResult

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.mtermvectors.TermVectorsResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class MultiTermVectorsResult implements JsonpSerializable {
	private final String id;

	private final String index;

	@Nullable
	private final Long version;

	@Nullable
	private final Long took;

	@Nullable
	private final Boolean found;

	private final Map<String, TermVector> termVectors;

	@Nullable
	private final ErrorCause error;

	// ---------------------------------------------------------------------------------------------

	private MultiTermVectorsResult(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.version = builder.version;
		this.took = builder.took;
		this.found = builder.found;
		this.termVectors = ApiTypeHelper.unmodifiable(builder.termVectors);
		this.error = builder.error;

	}

	public static MultiTermVectorsResult of(Function<Builder, ObjectBuilder<MultiTermVectorsResult>> fn) {
		return fn.apply(new Builder()).build();
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
	 * API name: {@code _version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * API name: {@code took}
	 */
	@Nullable
	public final Long took() {
		return this.took;
	}

	/**
	 * API name: {@code found}
	 */
	@Nullable
	public final Boolean found() {
		return this.found;
	}

	/**
	 * API name: {@code term_vectors}
	 */
	public final Map<String, TermVector> termVectors() {
		return this.termVectors;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final ErrorCause error() {
		return this.error;
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

		if (this.version != null) {
			generator.writeKey("_version");
			generator.write(this.version);

		}
		if (this.took != null) {
			generator.writeKey("took");
			generator.write(this.took);

		}
		if (this.found != null) {
			generator.writeKey("found");
			generator.write(this.found);

		}
		if (ApiTypeHelper.isDefined(this.termVectors)) {
			generator.writeKey("term_vectors");
			generator.writeStartObject();
			for (Map.Entry<String, TermVector> item0 : this.termVectors.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.error != null) {
			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultiTermVectorsResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MultiTermVectorsResult> {
		private String id;

		private String index;

		@Nullable
		private Long version;

		@Nullable
		private Long took;

		@Nullable
		private Boolean found;

		@Nullable
		private Map<String, TermVector> termVectors;

		@Nullable
		private ErrorCause error;

		/**
		 * Required - API name: {@code _id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code _index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code _version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code took}
		 */
		public final Builder took(@Nullable Long value) {
			this.took = value;
			return this;
		}

		/**
		 * API name: {@code found}
		 */
		public final Builder found(@Nullable Boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * API name: {@code term_vectors}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>termVectors</code>.
		 */
		public final Builder termVectors(Map<String, TermVector> map) {
			this.termVectors = _mapPutAll(this.termVectors, map);
			return this;
		}

		/**
		 * API name: {@code term_vectors}
		 * <p>
		 * Adds an entry to <code>termVectors</code>.
		 */
		public final Builder termVectors(String key, TermVector value) {
			this.termVectors = _mapPut(this.termVectors, key, value);
			return this;
		}

		/**
		 * API name: {@code term_vectors}
		 * <p>
		 * Adds an entry to <code>termVectors</code> using a builder lambda.
		 */
		public final Builder termVectors(String key, Function<TermVector.Builder, ObjectBuilder<TermVector>> fn) {
			return termVectors(key, fn.apply(new TermVector.Builder()).build());
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MultiTermVectorsResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultiTermVectorsResult build() {
			_checkSingleUse();

			return new MultiTermVectorsResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MultiTermVectorsResult}
	 */
	public static final JsonpDeserializer<MultiTermVectorsResult> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MultiTermVectorsResult::setupMultiTermVectorsResultDeserializer);

	protected static void setupMultiTermVectorsResultDeserializer(
			ObjectDeserializer<MultiTermVectorsResult.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::termVectors, JsonpDeserializer.stringMapDeserializer(TermVector._DESERIALIZER), "term_vectors");
		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");

	}

}
