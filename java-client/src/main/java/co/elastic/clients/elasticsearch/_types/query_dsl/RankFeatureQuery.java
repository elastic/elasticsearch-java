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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: _types.query_dsl.RankFeatureQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.RankFeatureQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class RankFeatureQuery extends QueryBase implements QueryVariant {
	private final String field;

	@Nullable
	private final RankFeatureFunctionSaturation saturation;

	@Nullable
	private final RankFeatureFunctionLogarithm log;

	@Nullable
	private final RankFeatureFunctionLinear linear;

	@Nullable
	private final RankFeatureFunctionSigmoid sigmoid;

	// ---------------------------------------------------------------------------------------------

	private RankFeatureQuery(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.saturation = builder.saturation;
		this.log = builder.log;
		this.linear = builder.linear;
		this.sigmoid = builder.sigmoid;

	}

	public static RankFeatureQuery of(Function<Builder, ObjectBuilder<RankFeatureQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.RankFeature;
	}

	/**
	 * Required - <code>rank_feature</code> or <code>rank_features</code> field used
	 * to boost relevance scores.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Saturation function used to boost relevance scores based on the value of the
	 * rank feature <code>field</code>.
	 * <p>
	 * API name: {@code saturation}
	 */
	@Nullable
	public final RankFeatureFunctionSaturation saturation() {
		return this.saturation;
	}

	/**
	 * Logarithmic function used to boost relevance scores based on the value of the
	 * rank feature <code>field</code>.
	 * <p>
	 * API name: {@code log}
	 */
	@Nullable
	public final RankFeatureFunctionLogarithm log() {
		return this.log;
	}

	/**
	 * Linear function used to boost relevance scores based on the value of the rank
	 * feature <code>field</code>.
	 * <p>
	 * API name: {@code linear}
	 */
	@Nullable
	public final RankFeatureFunctionLinear linear() {
		return this.linear;
	}

	/**
	 * Sigmoid function used to boost relevance scores based on the value of the
	 * rank feature <code>field</code>.
	 * <p>
	 * API name: {@code sigmoid}
	 */
	@Nullable
	public final RankFeatureFunctionSigmoid sigmoid() {
		return this.sigmoid;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (this.saturation != null) {
			generator.writeKey("saturation");
			this.saturation.serialize(generator, mapper);

		}
		if (this.log != null) {
			generator.writeKey("log");
			this.log.serialize(generator, mapper);

		}
		if (this.linear != null) {
			generator.writeKey("linear");
			this.linear.serialize(generator, mapper);

		}
		if (this.sigmoid != null) {
			generator.writeKey("sigmoid");
			this.sigmoid.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankFeatureQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<RankFeatureQuery> {
		private String field;

		@Nullable
		private RankFeatureFunctionSaturation saturation;

		@Nullable
		private RankFeatureFunctionLogarithm log;

		@Nullable
		private RankFeatureFunctionLinear linear;

		@Nullable
		private RankFeatureFunctionSigmoid sigmoid;

		/**
		 * Required - <code>rank_feature</code> or <code>rank_features</code> field used
		 * to boost relevance scores.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Saturation function used to boost relevance scores based on the value of the
		 * rank feature <code>field</code>.
		 * <p>
		 * API name: {@code saturation}
		 */
		public final Builder saturation(@Nullable RankFeatureFunctionSaturation value) {
			this.saturation = value;
			return this;
		}

		/**
		 * Saturation function used to boost relevance scores based on the value of the
		 * rank feature <code>field</code>.
		 * <p>
		 * API name: {@code saturation}
		 */
		public final Builder saturation(
				Function<RankFeatureFunctionSaturation.Builder, ObjectBuilder<RankFeatureFunctionSaturation>> fn) {
			return this.saturation(fn.apply(new RankFeatureFunctionSaturation.Builder()).build());
		}

		/**
		 * Logarithmic function used to boost relevance scores based on the value of the
		 * rank feature <code>field</code>.
		 * <p>
		 * API name: {@code log}
		 */
		public final Builder log(@Nullable RankFeatureFunctionLogarithm value) {
			this.log = value;
			return this;
		}

		/**
		 * Logarithmic function used to boost relevance scores based on the value of the
		 * rank feature <code>field</code>.
		 * <p>
		 * API name: {@code log}
		 */
		public final Builder log(
				Function<RankFeatureFunctionLogarithm.Builder, ObjectBuilder<RankFeatureFunctionLogarithm>> fn) {
			return this.log(fn.apply(new RankFeatureFunctionLogarithm.Builder()).build());
		}

		/**
		 * Linear function used to boost relevance scores based on the value of the rank
		 * feature <code>field</code>.
		 * <p>
		 * API name: {@code linear}
		 */
		public final Builder linear(@Nullable RankFeatureFunctionLinear value) {
			this.linear = value;
			return this;
		}

		/**
		 * Linear function used to boost relevance scores based on the value of the rank
		 * feature <code>field</code>.
		 * <p>
		 * API name: {@code linear}
		 */
		public final Builder linear(
				Function<RankFeatureFunctionLinear.Builder, ObjectBuilder<RankFeatureFunctionLinear>> fn) {
			return this.linear(fn.apply(new RankFeatureFunctionLinear.Builder()).build());
		}

		/**
		 * Sigmoid function used to boost relevance scores based on the value of the
		 * rank feature <code>field</code>.
		 * <p>
		 * API name: {@code sigmoid}
		 */
		public final Builder sigmoid(@Nullable RankFeatureFunctionSigmoid value) {
			this.sigmoid = value;
			return this;
		}

		/**
		 * Sigmoid function used to boost relevance scores based on the value of the
		 * rank feature <code>field</code>.
		 * <p>
		 * API name: {@code sigmoid}
		 */
		public final Builder sigmoid(
				Function<RankFeatureFunctionSigmoid.Builder, ObjectBuilder<RankFeatureFunctionSigmoid>> fn) {
			return this.sigmoid(fn.apply(new RankFeatureFunctionSigmoid.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankFeatureQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankFeatureQuery build() {
			_checkSingleUse();

			return new RankFeatureQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankFeatureQuery}
	 */
	public static final JsonpDeserializer<RankFeatureQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RankFeatureQuery::setupRankFeatureQueryDeserializer);

	protected static void setupRankFeatureQueryDeserializer(ObjectDeserializer<RankFeatureQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::saturation, RankFeatureFunctionSaturation._DESERIALIZER, "saturation");
		op.add(Builder::log, RankFeatureFunctionLogarithm._DESERIALIZER, "log");
		op.add(Builder::linear, RankFeatureFunctionLinear._DESERIALIZER, "linear");
		op.add(Builder::sigmoid, RankFeatureFunctionSigmoid._DESERIALIZER, "sigmoid");

	}

}
