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

package co.elastic.clients.elasticsearch.graph;

import co.elastic.clients.elasticsearch._types.Time;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: graph._types.ExploreControls

/**
 *
 * @see <a href="../doc-files/api-spec.html#graph._types.ExploreControls">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExploreControls implements JsonpSerializable {
	@Nullable
	private final SampleDiversity sampleDiversity;

	@Nullable
	private final Integer sampleSize;

	@Nullable
	private final Time timeout;

	private final boolean useSignificance;

	// ---------------------------------------------------------------------------------------------

	private ExploreControls(Builder builder) {

		this.sampleDiversity = builder.sampleDiversity;
		this.sampleSize = builder.sampleSize;
		this.timeout = builder.timeout;
		this.useSignificance = ApiTypeHelper.requireNonNull(builder.useSignificance, this, "useSignificance");

	}

	public static ExploreControls of(Function<Builder, ObjectBuilder<ExploreControls>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * To avoid the top-matching documents sample being dominated by a single source
	 * of results, it is sometimes necessary to request diversity in the sample. You
	 * can do this by selecting a single-value field and setting a maximum number of
	 * documents per value for that field.
	 * <p>
	 * API name: {@code sample_diversity}
	 */
	@Nullable
	public final SampleDiversity sampleDiversity() {
		return this.sampleDiversity;
	}

	/**
	 * Each hop considers a sample of the best-matching documents on each shard.
	 * Using samples improves the speed of execution and keeps exploration focused
	 * on meaningfully-connected terms. Very small values (less than 50) might not
	 * provide sufficient weight-of-evidence to identify significant connections
	 * between terms. Very large sample sizes can dilute the quality of the results
	 * and increase execution times.
	 * <p>
	 * API name: {@code sample_size}
	 */
	@Nullable
	public final Integer sampleSize() {
		return this.sampleSize;
	}

	/**
	 * The length of time in milliseconds after which exploration will be halted and
	 * the results gathered so far are returned. This timeout is honored on a
	 * best-effort basis. Execution might overrun this timeout if, for example, a
	 * long pause is encountered while FieldData is loaded for a field.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Required - Filters associated terms so only those that are significantly
	 * associated with your query are included.
	 * <p>
	 * API name: {@code use_significance}
	 */
	public final boolean useSignificance() {
		return this.useSignificance;
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

		if (this.sampleDiversity != null) {
			generator.writeKey("sample_diversity");
			this.sampleDiversity.serialize(generator, mapper);

		}
		if (this.sampleSize != null) {
			generator.writeKey("sample_size");
			generator.write(this.sampleSize);

		}
		if (this.timeout != null) {
			generator.writeKey("timeout");
			this.timeout.serialize(generator, mapper);

		}
		generator.writeKey("use_significance");
		generator.write(this.useSignificance);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExploreControls}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ExploreControls> {
		@Nullable
		private SampleDiversity sampleDiversity;

		@Nullable
		private Integer sampleSize;

		@Nullable
		private Time timeout;

		private Boolean useSignificance;

		/**
		 * To avoid the top-matching documents sample being dominated by a single source
		 * of results, it is sometimes necessary to request diversity in the sample. You
		 * can do this by selecting a single-value field and setting a maximum number of
		 * documents per value for that field.
		 * <p>
		 * API name: {@code sample_diversity}
		 */
		public final Builder sampleDiversity(@Nullable SampleDiversity value) {
			this.sampleDiversity = value;
			return this;
		}

		/**
		 * To avoid the top-matching documents sample being dominated by a single source
		 * of results, it is sometimes necessary to request diversity in the sample. You
		 * can do this by selecting a single-value field and setting a maximum number of
		 * documents per value for that field.
		 * <p>
		 * API name: {@code sample_diversity}
		 */
		public final Builder sampleDiversity(Function<SampleDiversity.Builder, ObjectBuilder<SampleDiversity>> fn) {
			return this.sampleDiversity(fn.apply(new SampleDiversity.Builder()).build());
		}

		/**
		 * Each hop considers a sample of the best-matching documents on each shard.
		 * Using samples improves the speed of execution and keeps exploration focused
		 * on meaningfully-connected terms. Very small values (less than 50) might not
		 * provide sufficient weight-of-evidence to identify significant connections
		 * between terms. Very large sample sizes can dilute the quality of the results
		 * and increase execution times.
		 * <p>
		 * API name: {@code sample_size}
		 */
		public final Builder sampleSize(@Nullable Integer value) {
			this.sampleSize = value;
			return this;
		}

		/**
		 * The length of time in milliseconds after which exploration will be halted and
		 * the results gathered so far are returned. This timeout is honored on a
		 * best-effort basis. Execution might overrun this timeout if, for example, a
		 * long pause is encountered while FieldData is loaded for a field.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The length of time in milliseconds after which exploration will be halted and
		 * the results gathered so far are returned. This timeout is honored on a
		 * best-effort basis. Execution might overrun this timeout if, for example, a
		 * long pause is encountered while FieldData is loaded for a field.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Filters associated terms so only those that are significantly
		 * associated with your query are included.
		 * <p>
		 * API name: {@code use_significance}
		 */
		public final Builder useSignificance(boolean value) {
			this.useSignificance = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExploreControls}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExploreControls build() {
			_checkSingleUse();

			return new ExploreControls(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExploreControls}
	 */
	public static final JsonpDeserializer<ExploreControls> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ExploreControls::setupExploreControlsDeserializer);

	protected static void setupExploreControlsDeserializer(ObjectDeserializer<ExploreControls.Builder> op) {

		op.add(Builder::sampleDiversity, SampleDiversity._DESERIALIZER, "sample_diversity");
		op.add(Builder::sampleSize, JsonpDeserializer.integerDeserializer(), "sample_size");
		op.add(Builder::timeout, Time._DESERIALIZER, "timeout");
		op.add(Builder::useSignificance, JsonpDeserializer.booleanDeserializer(), "use_significance");

	}

}
