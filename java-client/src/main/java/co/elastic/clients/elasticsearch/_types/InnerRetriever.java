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
import java.lang.Float;
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

// typedef: _types.InnerRetriever

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.InnerRetriever">API
 *      specification</a>
 */
@JsonpDeserializable
public class InnerRetriever implements JsonpSerializable {
	private final Retriever retriever;

	private final float weight;

	private final ScoreNormalizer normalizer;

	// ---------------------------------------------------------------------------------------------

	private InnerRetriever(Builder builder) {

		this.retriever = ApiTypeHelper.requireNonNull(builder.retriever, this, "retriever");
		this.weight = ApiTypeHelper.requireNonNull(builder.weight, this, "weight", 0);
		this.normalizer = ApiTypeHelper.requireNonNull(builder.normalizer, this, "normalizer");

	}

	public static InnerRetriever of(Function<Builder, ObjectBuilder<InnerRetriever>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code retriever}
	 */
	public final Retriever retriever() {
		return this.retriever;
	}

	/**
	 * Required - API name: {@code weight}
	 */
	public final float weight() {
		return this.weight;
	}

	/**
	 * Required - API name: {@code normalizer}
	 */
	public final ScoreNormalizer normalizer() {
		return this.normalizer;
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

		generator.writeKey("retriever");
		this.retriever.serialize(generator, mapper);

		generator.writeKey("weight");
		generator.write(this.weight);

		generator.writeKey("normalizer");
		this.normalizer.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InnerRetriever}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<InnerRetriever> {
		private Retriever retriever;

		private Float weight;

		private ScoreNormalizer normalizer;

		public Builder() {
		}
		private Builder(InnerRetriever instance) {
			this.retriever = instance.retriever;
			this.weight = instance.weight;
			this.normalizer = instance.normalizer;

		}
		/**
		 * Required - API name: {@code retriever}
		 */
		public final Builder retriever(Retriever value) {
			this.retriever = value;
			return this;
		}

		/**
		 * Required - API name: {@code retriever}
		 */
		public final Builder retriever(Function<Retriever.Builder, ObjectBuilder<Retriever>> fn) {
			return this.retriever(fn.apply(new Retriever.Builder()).build());
		}

		/**
		 * Required - API name: {@code retriever}
		 */
		public final Builder retriever(RetrieverVariant value) {
			this.retriever = value._toRetriever();
			return this;
		}

		/**
		 * Required - API name: {@code weight}
		 */
		public final Builder weight(float value) {
			this.weight = value;
			return this;
		}

		/**
		 * Required - API name: {@code normalizer}
		 */
		public final Builder normalizer(ScoreNormalizer value) {
			this.normalizer = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InnerRetriever}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InnerRetriever build() {
			_checkSingleUse();

			return new InnerRetriever(this);
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
	 * Json deserializer for {@link InnerRetriever}
	 */
	public static final JsonpDeserializer<InnerRetriever> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InnerRetriever::setupInnerRetrieverDeserializer);

	protected static void setupInnerRetrieverDeserializer(ObjectDeserializer<InnerRetriever.Builder> op) {

		op.add(Builder::retriever, Retriever._DESERIALIZER, "retriever");
		op.add(Builder::weight, JsonpDeserializer.floatDeserializer(), "weight");
		op.add(Builder::normalizer, ScoreNormalizer._DESERIALIZER, "normalizer");

	}

}
