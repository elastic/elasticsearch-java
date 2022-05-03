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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.IBDistribution;
import co.elastic.clients.elasticsearch._types.IBLambda;
import co.elastic.clients.elasticsearch._types.Normalization;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.SettingsSimilarityIb

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SettingsSimilarityIb">API
 *      specification</a>
 */
@JsonpDeserializable
public class SettingsSimilarityIb implements JsonpSerializable {
	private final IBDistribution distribution;

	private final IBLambda lambda;

	private final Normalization normalization;

	// ---------------------------------------------------------------------------------------------

	private SettingsSimilarityIb(Builder builder) {

		this.distribution = ApiTypeHelper.requireNonNull(builder.distribution, this, "distribution");
		this.lambda = ApiTypeHelper.requireNonNull(builder.lambda, this, "lambda");
		this.normalization = ApiTypeHelper.requireNonNull(builder.normalization, this, "normalization");

	}

	public static SettingsSimilarityIb of(Function<Builder, ObjectBuilder<SettingsSimilarityIb>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code distribution}
	 */
	public final IBDistribution distribution() {
		return this.distribution;
	}

	/**
	 * Required - API name: {@code lambda}
	 */
	public final IBLambda lambda() {
		return this.lambda;
	}

	/**
	 * Required - API name: {@code normalization}
	 */
	public final Normalization normalization() {
		return this.normalization;
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

		generator.writeKey("distribution");
		this.distribution.serialize(generator, mapper);
		generator.writeKey("lambda");
		this.lambda.serialize(generator, mapper);
		generator.writeKey("normalization");
		this.normalization.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SettingsSimilarityIb}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SettingsSimilarityIb> {
		private IBDistribution distribution;

		private IBLambda lambda;

		private Normalization normalization;

		/**
		 * Required - API name: {@code distribution}
		 */
		public final Builder distribution(IBDistribution value) {
			this.distribution = value;
			return this;
		}

		/**
		 * Required - API name: {@code lambda}
		 */
		public final Builder lambda(IBLambda value) {
			this.lambda = value;
			return this;
		}

		/**
		 * Required - API name: {@code normalization}
		 */
		public final Builder normalization(Normalization value) {
			this.normalization = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SettingsSimilarityIb}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SettingsSimilarityIb build() {
			_checkSingleUse();

			return new SettingsSimilarityIb(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SettingsSimilarityIb}
	 */
	public static final JsonpDeserializer<SettingsSimilarityIb> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SettingsSimilarityIb::setupSettingsSimilarityIbDeserializer);

	protected static void setupSettingsSimilarityIbDeserializer(ObjectDeserializer<SettingsSimilarityIb.Builder> op) {

		op.add(Builder::distribution, IBDistribution._DESERIALIZER, "distribution");
		op.add(Builder::lambda, IBLambda._DESERIALIZER, "lambda");
		op.add(Builder::normalization, Normalization._DESERIALIZER, "normalization");

	}

}
