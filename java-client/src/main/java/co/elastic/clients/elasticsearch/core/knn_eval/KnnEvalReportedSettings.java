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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: _global.knn_eval.KnnEvalReportedSettings

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.knn_eval.KnnEvalReportedSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnEvalReportedSettings extends KnnEvalSettings {
	@Nullable
	private final Boolean rescoreWindowCapped;

	@Nullable
	private final Boolean quantizedScores;

	// ---------------------------------------------------------------------------------------------

	private KnnEvalReportedSettings(Builder builder) {
		super(builder);

		this.rescoreWindowCapped = builder.rescoreWindowCapped;
		this.quantizedScores = builder.quantizedScores;

	}

	public static KnnEvalReportedSettings of(Function<Builder, ObjectBuilder<KnnEvalReportedSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>true</code>, the number of vectors to rescore exceeded the limit of
	 * 10000.
	 * <p>
	 * API name: {@code rescore_window_capped}
	 */
	@Nullable
	public final Boolean rescoreWindowCapped() {
		return this.rescoreWindowCapped;
	}

	/**
	 * If <code>true</code>, the hits were not rescored, so their scores are
	 * estimates, and no query is excluded from the mean recall.
	 * <p>
	 * API name: {@code quantized_scores}
	 */
	@Nullable
	public final Boolean quantizedScores() {
		return this.quantizedScores;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.rescoreWindowCapped != null) {
			generator.writeKey("rescore_window_capped");
			generator.write(this.rescoreWindowCapped);

		}
		if (this.quantizedScores != null) {
			generator.writeKey("quantized_scores");
			generator.write(this.quantizedScores);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnEvalReportedSettings}.
	 */

	public static class Builder extends KnnEvalSettings.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KnnEvalReportedSettings> {
		@Nullable
		private Boolean rescoreWindowCapped;

		@Nullable
		private Boolean quantizedScores;

		public Builder() {
		}
		private Builder(KnnEvalReportedSettings instance) {
			super(instance);
			this.rescoreWindowCapped = instance.rescoreWindowCapped;
			this.quantizedScores = instance.quantizedScores;

		}
		/**
		 * If <code>true</code>, the number of vectors to rescore exceeded the limit of
		 * 10000.
		 * <p>
		 * API name: {@code rescore_window_capped}
		 */
		public final Builder rescoreWindowCapped(@Nullable Boolean value) {
			this.rescoreWindowCapped = value;
			return this;
		}

		/**
		 * If <code>true</code>, the hits were not rescored, so their scores are
		 * estimates, and no query is excluded from the mean recall.
		 * <p>
		 * API name: {@code quantized_scores}
		 */
		public final Builder quantizedScores(@Nullable Boolean value) {
			this.quantizedScores = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnEvalReportedSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnEvalReportedSettings build() {
			_checkSingleUse();

			return new KnnEvalReportedSettings(this);
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
	 * Json deserializer for {@link KnnEvalReportedSettings}
	 */
	public static final JsonpDeserializer<KnnEvalReportedSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KnnEvalReportedSettings::setupKnnEvalReportedSettingsDeserializer);

	protected static void setupKnnEvalReportedSettingsDeserializer(
			ObjectDeserializer<KnnEvalReportedSettings.Builder> op) {
		KnnEvalSettings.setupKnnEvalSettingsDeserializer(op);
		op.add(Builder::rescoreWindowCapped, JsonpDeserializer.booleanDeserializer(), "rescore_window_capped");
		op.add(Builder::quantizedScores, JsonpDeserializer.booleanDeserializer(), "quantized_scores");

	}

}
