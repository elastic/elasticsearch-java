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

package co.elastic.clients.elasticsearch.transform;

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

// typedef: transform._types.Settings

/**
 * The source of the data for the transform.
 * 
 * @see <a href="../doc-files/api-spec.html#transform._types.Settings">API
 *      specification</a>
 */
@JsonpDeserializable
public class Settings implements JsonpSerializable {
	@Nullable
	private final Boolean alignCheckpoints;

	@Nullable
	private final Boolean datesAsEpochMillis;

	@Nullable
	private final Boolean deduceMappings;

	@Nullable
	private final Float docsPerSecond;

	@Nullable
	private final Integer maxPageSearchSize;

	@Nullable
	private final Boolean unattended;

	// ---------------------------------------------------------------------------------------------

	private Settings(Builder builder) {

		this.alignCheckpoints = builder.alignCheckpoints;
		this.datesAsEpochMillis = builder.datesAsEpochMillis;
		this.deduceMappings = builder.deduceMappings;
		this.docsPerSecond = builder.docsPerSecond;
		this.maxPageSearchSize = builder.maxPageSearchSize;
		this.unattended = builder.unattended;

	}

	public static Settings of(Function<Builder, ObjectBuilder<Settings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies whether the transform checkpoint ranges should be optimized for
	 * performance. Such optimization can align checkpoint ranges with the date
	 * histogram interval when date histogram is specified as a group source in the
	 * transform config. As a result, less document updates in the destination index
	 * will be performed thus improving overall performance.
	 * <p>
	 * API name: {@code align_checkpoints}
	 */
	@Nullable
	public final Boolean alignCheckpoints() {
		return this.alignCheckpoints;
	}

	/**
	 * Defines if dates in the ouput should be written as ISO formatted string or as
	 * millis since epoch. epoch_millis was the default for transforms created
	 * before version 7.11. For compatible output set this value to
	 * <code>true</code>.
	 * <p>
	 * API name: {@code dates_as_epoch_millis}
	 */
	@Nullable
	public final Boolean datesAsEpochMillis() {
		return this.datesAsEpochMillis;
	}

	/**
	 * Specifies whether the transform should deduce the destination index mappings
	 * from the transform configuration.
	 * <p>
	 * API name: {@code deduce_mappings}
	 */
	@Nullable
	public final Boolean deduceMappings() {
		return this.deduceMappings;
	}

	/**
	 * Specifies a limit on the number of input documents per second. This setting
	 * throttles the transform by adding a wait time between search requests. The
	 * default value is null, which disables throttling.
	 * <p>
	 * API name: {@code docs_per_second}
	 */
	@Nullable
	public final Float docsPerSecond() {
		return this.docsPerSecond;
	}

	/**
	 * Defines the initial page size to use for the composite aggregation for each
	 * checkpoint. If circuit breaker exceptions occur, the page size is dynamically
	 * adjusted to a lower value. The minimum value is <code>10</code> and the
	 * maximum is <code>65,536</code>.
	 * <p>
	 * API name: {@code max_page_search_size}
	 */
	@Nullable
	public final Integer maxPageSearchSize() {
		return this.maxPageSearchSize;
	}

	/**
	 * If <code>true</code>, the transform runs in unattended mode. In unattended
	 * mode, the transform retries indefinitely in case of an error which means the
	 * transform never fails. Setting the number of retries other than infinite
	 * fails in validation.
	 * <p>
	 * API name: {@code unattended}
	 */
	@Nullable
	public final Boolean unattended() {
		return this.unattended;
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

		if (this.alignCheckpoints != null) {
			generator.writeKey("align_checkpoints");
			generator.write(this.alignCheckpoints);

		}
		if (this.datesAsEpochMillis != null) {
			generator.writeKey("dates_as_epoch_millis");
			generator.write(this.datesAsEpochMillis);

		}
		if (this.deduceMappings != null) {
			generator.writeKey("deduce_mappings");
			generator.write(this.deduceMappings);

		}
		if (this.docsPerSecond != null) {
			generator.writeKey("docs_per_second");
			generator.write(this.docsPerSecond);

		}
		if (this.maxPageSearchSize != null) {
			generator.writeKey("max_page_search_size");
			generator.write(this.maxPageSearchSize);

		}
		if (this.unattended != null) {
			generator.writeKey("unattended");
			generator.write(this.unattended);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Settings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Settings> {
		@Nullable
		private Boolean alignCheckpoints;

		@Nullable
		private Boolean datesAsEpochMillis;

		@Nullable
		private Boolean deduceMappings;

		@Nullable
		private Float docsPerSecond;

		@Nullable
		private Integer maxPageSearchSize;

		@Nullable
		private Boolean unattended;

		/**
		 * Specifies whether the transform checkpoint ranges should be optimized for
		 * performance. Such optimization can align checkpoint ranges with the date
		 * histogram interval when date histogram is specified as a group source in the
		 * transform config. As a result, less document updates in the destination index
		 * will be performed thus improving overall performance.
		 * <p>
		 * API name: {@code align_checkpoints}
		 */
		public final Builder alignCheckpoints(@Nullable Boolean value) {
			this.alignCheckpoints = value;
			return this;
		}

		/**
		 * Defines if dates in the ouput should be written as ISO formatted string or as
		 * millis since epoch. epoch_millis was the default for transforms created
		 * before version 7.11. For compatible output set this value to
		 * <code>true</code>.
		 * <p>
		 * API name: {@code dates_as_epoch_millis}
		 */
		public final Builder datesAsEpochMillis(@Nullable Boolean value) {
			this.datesAsEpochMillis = value;
			return this;
		}

		/**
		 * Specifies whether the transform should deduce the destination index mappings
		 * from the transform configuration.
		 * <p>
		 * API name: {@code deduce_mappings}
		 */
		public final Builder deduceMappings(@Nullable Boolean value) {
			this.deduceMappings = value;
			return this;
		}

		/**
		 * Specifies a limit on the number of input documents per second. This setting
		 * throttles the transform by adding a wait time between search requests. The
		 * default value is null, which disables throttling.
		 * <p>
		 * API name: {@code docs_per_second}
		 */
		public final Builder docsPerSecond(@Nullable Float value) {
			this.docsPerSecond = value;
			return this;
		}

		/**
		 * Defines the initial page size to use for the composite aggregation for each
		 * checkpoint. If circuit breaker exceptions occur, the page size is dynamically
		 * adjusted to a lower value. The minimum value is <code>10</code> and the
		 * maximum is <code>65,536</code>.
		 * <p>
		 * API name: {@code max_page_search_size}
		 */
		public final Builder maxPageSearchSize(@Nullable Integer value) {
			this.maxPageSearchSize = value;
			return this;
		}

		/**
		 * If <code>true</code>, the transform runs in unattended mode. In unattended
		 * mode, the transform retries indefinitely in case of an error which means the
		 * transform never fails. Setting the number of retries other than infinite
		 * fails in validation.
		 * <p>
		 * API name: {@code unattended}
		 */
		public final Builder unattended(@Nullable Boolean value) {
			this.unattended = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Settings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Settings build() {
			_checkSingleUse();

			return new Settings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Settings}
	 */
	public static final JsonpDeserializer<Settings> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Settings::setupSettingsDeserializer);

	protected static void setupSettingsDeserializer(ObjectDeserializer<Settings.Builder> op) {

		op.add(Builder::alignCheckpoints, JsonpDeserializer.booleanDeserializer(), "align_checkpoints");
		op.add(Builder::datesAsEpochMillis, JsonpDeserializer.booleanDeserializer(), "dates_as_epoch_millis");
		op.add(Builder::deduceMappings, JsonpDeserializer.booleanDeserializer(), "deduce_mappings");
		op.add(Builder::docsPerSecond, JsonpDeserializer.floatDeserializer(), "docs_per_second");
		op.add(Builder::maxPageSearchSize, JsonpDeserializer.integerDeserializer(), "max_page_search_size");
		op.add(Builder::unattended, JsonpDeserializer.booleanDeserializer(), "unattended");

	}

}
