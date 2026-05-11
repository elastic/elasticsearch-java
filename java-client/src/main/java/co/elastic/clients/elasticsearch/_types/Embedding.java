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

// typedef: _types.Embedding

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.Embedding">API
 *      specification</a>
 */
@JsonpDeserializable
public class Embedding implements QueryVectorBuilderVariant, JsonpSerializable {
	@Nullable
	private final String inferenceId;

	private final KnnEmbeddingInput input;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private Embedding(Builder builder) {

		this.inferenceId = builder.inferenceId;
		this.input = ApiTypeHelper.requireNonNull(builder.input, this, "input");
		this.timeout = builder.timeout;

	}

	public static Embedding of(Function<Builder, ObjectBuilder<Embedding>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * QueryVectorBuilder variant kind.
	 */
	@Override
	public QueryVectorBuilder.Kind _queryVectorBuilderKind() {
		return QueryVectorBuilder.Kind.Embedding;
	}

	/**
	 * API name: {@code inference_id}
	 */
	@Nullable
	public final String inferenceId() {
		return this.inferenceId;
	}

	/**
	 * Required - API name: {@code input}
	 */
	public final KnnEmbeddingInput input() {
		return this.input;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

		if (this.inferenceId != null) {
			generator.writeKey("inference_id");
			generator.write(this.inferenceId);

		}
		generator.writeKey("input");
		this.input.serialize(generator, mapper);

		if (this.timeout != null) {
			generator.writeKey("timeout");
			this.timeout.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Embedding}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Embedding> {
		@Nullable
		private String inferenceId;

		private KnnEmbeddingInput input;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(Embedding instance) {
			this.inferenceId = instance.inferenceId;
			this.input = instance.input;
			this.timeout = instance.timeout;

		}
		/**
		 * API name: {@code inference_id}
		 */
		public final Builder inferenceId(@Nullable String value) {
			this.inferenceId = value;
			return this;
		}

		/**
		 * Required - API name: {@code input}
		 */
		public final Builder input(KnnEmbeddingInput value) {
			this.input = value;
			return this;
		}

		/**
		 * Required - API name: {@code input}
		 */
		public final Builder input(Function<KnnEmbeddingInput.Builder, ObjectBuilder<KnnEmbeddingInput>> fn) {
			return this.input(fn.apply(new KnnEmbeddingInput.Builder()).build());
		}

		/**
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Embedding}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Embedding build() {
			_checkSingleUse();

			return new Embedding(this);
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
	 * Json deserializer for {@link Embedding}
	 */
	public static final JsonpDeserializer<Embedding> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Embedding::setupEmbeddingDeserializer);

	protected static void setupEmbeddingDeserializer(ObjectDeserializer<Embedding.Builder> op) {

		op.add(Builder::inferenceId, JsonpDeserializer.stringDeserializer(), "inference_id");
		op.add(Builder::input, KnnEmbeddingInput._DESERIALIZER, "input");
		op.add(Builder::timeout, Time._DESERIALIZER, "timeout");

	}

}
