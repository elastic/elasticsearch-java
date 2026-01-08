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

// typedef: _types.RRFRetrieverComponent

/**
 * Wraps a retriever with an optional weight for RRF scoring.
 * 
 * @see <a href="../doc-files/api-spec.html#_types.RRFRetrieverComponent">API
 *      specification</a>
 */
@JsonpDeserializable
public class RRFRetrieverComponent implements JsonpSerializable {
	private final Retriever retriever;

	@Nullable
	private final Float weight;

	// ---------------------------------------------------------------------------------------------

	private RRFRetrieverComponent(Builder builder) {

		this.retriever = ApiTypeHelper.requireNonNull(builder.retriever, this, "retriever");
		this.weight = builder.weight;

	}

	public static RRFRetrieverComponent of(Function<Builder, ObjectBuilder<RRFRetrieverComponent>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The nested retriever configuration.
	 * <p>
	 * API name: {@code retriever}
	 */
	public final Retriever retriever() {
		return this.retriever;
	}

	/**
	 * Weight multiplier for this retriever's contribution to the RRF score. Higher
	 * values increase influence. Defaults to 1.0 if not specified. Must be
	 * non-negative.
	 * <p>
	 * API name: {@code weight}
	 */
	@Nullable
	public final Float weight() {
		return this.weight;
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

		if (this.weight != null) {
			generator.writeKey("weight");
			generator.write(this.weight);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RRFRetrieverComponent}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RRFRetrieverComponent> {
		private Retriever retriever;

		@Nullable
		private Float weight;

		/**
		 * Required - The nested retriever configuration.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(Retriever value) {
			this.retriever = value;
			return this;
		}

		/**
		 * Required - The nested retriever configuration.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(Function<Retriever.Builder, ObjectBuilder<Retriever>> fn) {
			return this.retriever(fn.apply(new Retriever.Builder()).build());
		}

		/**
		 * Required - The nested retriever configuration.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(RetrieverVariant value) {
			this.retriever = value._toRetriever();
			return this;
		}

		/**
		 * Weight multiplier for this retriever's contribution to the RRF score. Higher
		 * values increase influence. Defaults to 1.0 if not specified. Must be
		 * non-negative.
		 * <p>
		 * API name: {@code weight}
		 */
		public final Builder weight(@Nullable Float value) {
			this.weight = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RRFRetrieverComponent}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RRFRetrieverComponent build() {
			_checkSingleUse();

			return new RRFRetrieverComponent(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RRFRetrieverComponent}
	 */
	public static final JsonpDeserializer<RRFRetrieverComponent> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RRFRetrieverComponent::setupRRFRetrieverComponentDeserializer);

	protected static void setupRRFRetrieverComponentDeserializer(ObjectDeserializer<RRFRetrieverComponent.Builder> op) {

		op.add(Builder::retriever, Retriever._DESERIALIZER, "retriever");
		op.add(Builder::weight, JsonpDeserializer.floatDeserializer(), "weight");

	}

}
