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

package co.elastic.clients.elasticsearch.core.knn_eval;

import co.elastic.clients.elasticsearch._types.RescoreVector;
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
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
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

// typedef: _global.knn_eval.KnnEvalSettings

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.knn_eval.KnnEvalSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnEvalSettings implements JsonpSerializable {
	@Nullable
	private final Float visitPercentage;

	@Nullable
	private final Integer numCandidates;

	@Nullable
	private final RescoreVector rescoreVector;

	@Nullable
	private final Boolean exact;

	// ---------------------------------------------------------------------------------------------

	protected KnnEvalSettings(AbstractBuilder<?> builder) {

		this.visitPercentage = builder.visitPercentage;
		this.numCandidates = builder.numCandidates;
		this.rescoreVector = builder.rescoreVector;
		this.exact = builder.exact;

	}

	public static KnnEvalSettings knnEvalSettingsOf(Function<Builder, ObjectBuilder<KnnEvalSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The percentage of postings to visit, from 0 to 100. <code>0</code> selects
	 * the automatic visit calculation.
	 * <p>
	 * API name: {@code visit_percentage}
	 */
	@Nullable
	public final Float visitPercentage() {
		return this.visitPercentage;
	}

	/**
	 * The number of nearest neighbor candidates to consider per shard. It can't be
	 * less than <code>k</code>, or more than 10000 (9999 with sampling).
	 * <p>
	 * API name: {@code num_candidates}
	 */
	@Nullable
	public final Integer numCandidates() {
		return this.numCandidates;
	}

	/**
	 * The rescoring of the candidates. Only applies to quantized fields.
	 * <p>
	 * API name: {@code rescore_vector}
	 */
	@Nullable
	public final RescoreVector rescoreVector() {
		return this.rescoreVector;
	}

	/**
	 * If <code>true</code>, compares every vector at full precision. Only applies
	 * to the <code>baseline</code>, requires <code>allow_exact_baseline</code>, and
	 * can't be combined with other settings.
	 * <p>
	 * API name: {@code exact}
	 */
	@Nullable
	public final Boolean exact() {
		return this.exact;
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

		if (this.visitPercentage != null) {
			generator.writeKey("visit_percentage");
			generator.write(this.visitPercentage);

		}
		if (this.numCandidates != null) {
			generator.writeKey("num_candidates");
			generator.write(this.numCandidates);

		}
		if (this.rescoreVector != null) {
			generator.writeKey("rescore_vector");
			this.rescoreVector.serialize(generator, mapper);

		}
		if (this.exact != null) {
			generator.writeKey("exact");
			generator.write(this.exact);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnEvalSettings}.
	 */

	public static class Builder extends KnnEvalSettings.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KnnEvalSettings> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnEvalSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnEvalSettings build() {
			_checkSingleUse();

			return new KnnEvalSettings(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private Float visitPercentage;

		@Nullable
		private Integer numCandidates;

		@Nullable
		private RescoreVector rescoreVector;

		@Nullable
		private Boolean exact;

		/**
		 * The percentage of postings to visit, from 0 to 100. <code>0</code> selects
		 * the automatic visit calculation.
		 * <p>
		 * API name: {@code visit_percentage}
		 */
		public final BuilderT visitPercentage(@Nullable Float value) {
			this.visitPercentage = value;
			return self();
		}

		/**
		 * The number of nearest neighbor candidates to consider per shard. It can't be
		 * less than <code>k</code>, or more than 10000 (9999 with sampling).
		 * <p>
		 * API name: {@code num_candidates}
		 */
		public final BuilderT numCandidates(@Nullable Integer value) {
			this.numCandidates = value;
			return self();
		}

		/**
		 * The rescoring of the candidates. Only applies to quantized fields.
		 * <p>
		 * API name: {@code rescore_vector}
		 */
		public final BuilderT rescoreVector(@Nullable RescoreVector value) {
			this.rescoreVector = value;
			return self();
		}

		/**
		 * The rescoring of the candidates. Only applies to quantized fields.
		 * <p>
		 * API name: {@code rescore_vector}
		 */
		public final BuilderT rescoreVector(Function<RescoreVector.Builder, ObjectBuilder<RescoreVector>> fn) {
			return this.rescoreVector(fn.apply(new RescoreVector.Builder()).build());
		}

		/**
		 * If <code>true</code>, compares every vector at full precision. Only applies
		 * to the <code>baseline</code>, requires <code>allow_exact_baseline</code>, and
		 * can't be combined with other settings.
		 * <p>
		 * API name: {@code exact}
		 */
		public final BuilderT exact(@Nullable Boolean value) {
			this.exact = value;
			return self();
		}

		protected AbstractBuilder() {
		}

		protected AbstractBuilder(KnnEvalSettings instance) {
			this.visitPercentage = instance.visitPercentage;
			this.numCandidates = instance.numCandidates;
			this.rescoreVector = instance.rescoreVector;
			this.exact = instance.exact;

		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KnnEvalSettings}
	 */
	public static final JsonpDeserializer<KnnEvalSettings> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KnnEvalSettings::setupKnnEvalSettingsDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupKnnEvalSettingsDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::visitPercentage, JsonpDeserializer.floatDeserializer(), "visit_percentage");
		op.add(AbstractBuilder::numCandidates, JsonpDeserializer.integerDeserializer(), "num_candidates");
		op.add(AbstractBuilder::rescoreVector, RescoreVector._DESERIALIZER, "rescore_vector");
		op.add(AbstractBuilder::exact, JsonpDeserializer.booleanDeserializer(), "exact");

	}

}
