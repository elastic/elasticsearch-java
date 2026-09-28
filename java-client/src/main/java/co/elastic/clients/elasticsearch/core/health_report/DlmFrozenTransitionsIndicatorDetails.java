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

package co.elastic.clients.elasticsearch.core.health_report;

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
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import java.util.Map;
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

// typedef: _global.health_report.DlmFrozenTransitionsIndicatorDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.DlmFrozenTransitionsIndicatorDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class DlmFrozenTransitionsIndicatorDetails implements JsonpSerializable {
	@Nullable
	private final Boolean transitionsEnabled;

	@Nullable
	private final Boolean serviceRunning;

	@Nullable
	private final Boolean defaultRepositoryConfigured;

	@Nullable
	private final Integer overdueIndicesCount;

	private final Map<DlmFrozenTransitionState, Integer> overdueIndicesCountByState;

	private final List<DlmFrozenTransitionOverdueIndex> overdueIndicesSample;

	@Nullable
	private final Long generatedAtMillis;

	// ---------------------------------------------------------------------------------------------

	private DlmFrozenTransitionsIndicatorDetails(Builder builder) {

		this.transitionsEnabled = builder.transitionsEnabled;
		this.serviceRunning = builder.serviceRunning;
		this.defaultRepositoryConfigured = builder.defaultRepositoryConfigured;
		this.overdueIndicesCount = builder.overdueIndicesCount;
		this.overdueIndicesCountByState = ApiTypeHelper.unmodifiable(builder.overdueIndicesCountByState);
		this.overdueIndicesSample = ApiTypeHelper.unmodifiable(builder.overdueIndicesSample);
		this.generatedAtMillis = builder.generatedAtMillis;

	}

	public static DlmFrozenTransitionsIndicatorDetails of(
			Function<Builder, ObjectBuilder<DlmFrozenTransitionsIndicatorDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code transitions_enabled}
	 */
	@Nullable
	public final Boolean transitionsEnabled() {
		return this.transitionsEnabled;
	}

	/**
	 * API name: {@code service_running}
	 */
	@Nullable
	public final Boolean serviceRunning() {
		return this.serviceRunning;
	}

	/**
	 * API name: {@code default_repository_configured}
	 */
	@Nullable
	public final Boolean defaultRepositoryConfigured() {
		return this.defaultRepositoryConfigured;
	}

	/**
	 * API name: {@code overdue_indices_count}
	 */
	@Nullable
	public final Integer overdueIndicesCount() {
		return this.overdueIndicesCount;
	}

	/**
	 * API name: {@code overdue_indices_count_by_state}
	 */
	public final Map<DlmFrozenTransitionState, Integer> overdueIndicesCountByState() {
		return this.overdueIndicesCountByState;
	}

	/**
	 * API name: {@code overdue_indices_sample}
	 */
	public final List<DlmFrozenTransitionOverdueIndex> overdueIndicesSample() {
		return this.overdueIndicesSample;
	}

	/**
	 * Only present when the indicator status is <code>unknown</code>, meaning the
	 * health snapshot is stale.
	 * <p>
	 * API name: {@code generated_at_millis}
	 */
	@Nullable
	public final Long generatedAtMillis() {
		return this.generatedAtMillis;
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

		if (this.transitionsEnabled != null) {
			generator.writeKey("transitions_enabled");
			generator.write(this.transitionsEnabled);

		}
		if (this.serviceRunning != null) {
			generator.writeKey("service_running");
			generator.write(this.serviceRunning);

		}
		if (this.defaultRepositoryConfigured != null) {
			generator.writeKey("default_repository_configured");
			generator.write(this.defaultRepositoryConfigured);

		}
		if (this.overdueIndicesCount != null) {
			generator.writeKey("overdue_indices_count");
			generator.write(this.overdueIndicesCount);

		}
		if (ApiTypeHelper.isDefined(this.overdueIndicesCountByState)) {
			generator.writeKey("overdue_indices_count_by_state");
			generator.writeStartObject();
			for (Map.Entry<DlmFrozenTransitionState, Integer> item0 : this.overdueIndicesCountByState.entrySet()) {
				generator.writeKey(item0.getKey().jsonValue());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.overdueIndicesSample)) {
			generator.writeKey("overdue_indices_sample");
			generator.writeStartArray();
			for (DlmFrozenTransitionOverdueIndex item0 : this.overdueIndicesSample) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.generatedAtMillis != null) {
			generator.writeKey("generated_at_millis");
			generator.write(this.generatedAtMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DlmFrozenTransitionsIndicatorDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DlmFrozenTransitionsIndicatorDetails> {
		@Nullable
		private Boolean transitionsEnabled;

		@Nullable
		private Boolean serviceRunning;

		@Nullable
		private Boolean defaultRepositoryConfigured;

		@Nullable
		private Integer overdueIndicesCount;

		@Nullable
		private Map<DlmFrozenTransitionState, Integer> overdueIndicesCountByState;

		@Nullable
		private List<DlmFrozenTransitionOverdueIndex> overdueIndicesSample;

		@Nullable
		private Long generatedAtMillis;

		public Builder() {
		}
		private Builder(DlmFrozenTransitionsIndicatorDetails instance) {
			this.transitionsEnabled = instance.transitionsEnabled;
			this.serviceRunning = instance.serviceRunning;
			this.defaultRepositoryConfigured = instance.defaultRepositoryConfigured;
			this.overdueIndicesCount = instance.overdueIndicesCount;
			this.overdueIndicesCountByState = instance.overdueIndicesCountByState;
			this.overdueIndicesSample = instance.overdueIndicesSample;
			this.generatedAtMillis = instance.generatedAtMillis;

		}
		/**
		 * API name: {@code transitions_enabled}
		 */
		public final Builder transitionsEnabled(@Nullable Boolean value) {
			this.transitionsEnabled = value;
			return this;
		}

		/**
		 * API name: {@code service_running}
		 */
		public final Builder serviceRunning(@Nullable Boolean value) {
			this.serviceRunning = value;
			return this;
		}

		/**
		 * API name: {@code default_repository_configured}
		 */
		public final Builder defaultRepositoryConfigured(@Nullable Boolean value) {
			this.defaultRepositoryConfigured = value;
			return this;
		}

		/**
		 * API name: {@code overdue_indices_count}
		 */
		public final Builder overdueIndicesCount(@Nullable Integer value) {
			this.overdueIndicesCount = value;
			return this;
		}

		/**
		 * API name: {@code overdue_indices_count_by_state}
		 * <p>
		 * Adds all entries of <code>map</code> to
		 * <code>overdueIndicesCountByState</code>.
		 */
		public final Builder overdueIndicesCountByState(Map<DlmFrozenTransitionState, Integer> map) {
			this.overdueIndicesCountByState = _mapPutAll(this.overdueIndicesCountByState, map);
			return this;
		}

		/**
		 * API name: {@code overdue_indices_count_by_state}
		 * <p>
		 * Adds an entry to <code>overdueIndicesCountByState</code>.
		 */
		public final Builder overdueIndicesCountByState(DlmFrozenTransitionState key, Integer value) {
			this.overdueIndicesCountByState = _mapPut(this.overdueIndicesCountByState, key, value);
			return this;
		}

		/**
		 * API name: {@code overdue_indices_sample}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>overdueIndicesSample</code>.
		 */
		public final Builder overdueIndicesSample(List<DlmFrozenTransitionOverdueIndex> list) {
			this.overdueIndicesSample = _listAddAll(this.overdueIndicesSample, list);
			return this;
		}

		/**
		 * API name: {@code overdue_indices_sample}
		 * <p>
		 * Adds one or more values to <code>overdueIndicesSample</code>.
		 */
		public final Builder overdueIndicesSample(DlmFrozenTransitionOverdueIndex value,
				DlmFrozenTransitionOverdueIndex... values) {
			this.overdueIndicesSample = _listAdd(this.overdueIndicesSample, value, values);
			return this;
		}

		/**
		 * API name: {@code overdue_indices_sample}
		 * <p>
		 * Adds a value to <code>overdueIndicesSample</code> using a builder lambda.
		 */
		public final Builder overdueIndicesSample(
				Function<DlmFrozenTransitionOverdueIndex.Builder, ObjectBuilder<DlmFrozenTransitionOverdueIndex>> fn) {
			return overdueIndicesSample(fn.apply(new DlmFrozenTransitionOverdueIndex.Builder()).build());
		}

		/**
		 * Only present when the indicator status is <code>unknown</code>, meaning the
		 * health snapshot is stale.
		 * <p>
		 * API name: {@code generated_at_millis}
		 */
		public final Builder generatedAtMillis(@Nullable Long value) {
			this.generatedAtMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DlmFrozenTransitionsIndicatorDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DlmFrozenTransitionsIndicatorDetails build() {
			_checkSingleUse();

			return new DlmFrozenTransitionsIndicatorDetails(this);
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
	 * Json deserializer for {@link DlmFrozenTransitionsIndicatorDetails}
	 */
	public static final JsonpDeserializer<DlmFrozenTransitionsIndicatorDetails> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DlmFrozenTransitionsIndicatorDetails::setupDlmFrozenTransitionsIndicatorDetailsDeserializer);

	protected static void setupDlmFrozenTransitionsIndicatorDetailsDeserializer(
			ObjectDeserializer<DlmFrozenTransitionsIndicatorDetails.Builder> op) {

		op.add(Builder::transitionsEnabled, JsonpDeserializer.booleanDeserializer(), "transitions_enabled");
		op.add(Builder::serviceRunning, JsonpDeserializer.booleanDeserializer(), "service_running");
		op.add(Builder::defaultRepositoryConfigured, JsonpDeserializer.booleanDeserializer(),
				"default_repository_configured");
		op.add(Builder::overdueIndicesCount, JsonpDeserializer.integerDeserializer(), "overdue_indices_count");
		op.add(Builder::overdueIndicesCountByState, JsonpDeserializer
				.enumMapDeserializer(DlmFrozenTransitionState._DESERIALIZER, JsonpDeserializer.integerDeserializer()),
				"overdue_indices_count_by_state");
		op.add(Builder::overdueIndicesSample,
				JsonpDeserializer.arrayDeserializer(DlmFrozenTransitionOverdueIndex._DESERIALIZER),
				"overdue_indices_sample");
		op.add(Builder::generatedAtMillis, JsonpDeserializer.longDeserializer(), "generated_at_millis");

	}

}
