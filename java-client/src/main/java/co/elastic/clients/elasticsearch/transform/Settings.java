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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform._types.Settings
@JsonpDeserializable
public class Settings implements JsonpSerializable {
	@Nullable
	private final Boolean datesAsEpochMillis;

	@Nullable
	private final Float docsPerSecond;

	@Nullable
	private final Integer maxPageSearchSize;

	// ---------------------------------------------------------------------------------------------

	private Settings(Builder builder) {

		this.datesAsEpochMillis = builder.datesAsEpochMillis;
		this.docsPerSecond = builder.docsPerSecond;
		this.maxPageSearchSize = builder.maxPageSearchSize;

	}

	public static Settings of(Function<Builder, ObjectBuilder<Settings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Defines if dates in the ouput should be written as ISO formatted string
	 * (default) or as millis since epoch. epoch_millis has been the default for
	 * transforms created before version 7.11. For compatible output set this to
	 * true.
	 * <p>
	 * API name: {@code dates_as_epoch_millis}
	 */
	@Nullable
	public final Boolean datesAsEpochMillis() {
		return this.datesAsEpochMillis;
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
	 * adjusted to a lower value. The minimum value is 10 and the maximum is 10,000.
	 * <p>
	 * API name: {@code max_page_search_size}
	 */
	@Nullable
	public final Integer maxPageSearchSize() {
		return this.maxPageSearchSize;
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

		if (this.datesAsEpochMillis != null) {
			generator.writeKey("dates_as_epoch_millis");
			generator.write(this.datesAsEpochMillis);

		}
		if (this.docsPerSecond != null) {
			generator.writeKey("docs_per_second");
			generator.write(this.docsPerSecond);

		}
		if (this.maxPageSearchSize != null) {
			generator.writeKey("max_page_search_size");
			generator.write(this.maxPageSearchSize);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Settings}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Settings> {
		@Nullable
		private Boolean datesAsEpochMillis;

		@Nullable
		private Float docsPerSecond;

		@Nullable
		private Integer maxPageSearchSize;

		/**
		 * Defines if dates in the ouput should be written as ISO formatted string
		 * (default) or as millis since epoch. epoch_millis has been the default for
		 * transforms created before version 7.11. For compatible output set this to
		 * true.
		 * <p>
		 * API name: {@code dates_as_epoch_millis}
		 */
		public final Builder datesAsEpochMillis(@Nullable Boolean value) {
			this.datesAsEpochMillis = value;
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
		 * adjusted to a lower value. The minimum value is 10 and the maximum is 10,000.
		 * <p>
		 * API name: {@code max_page_search_size}
		 */
		public final Builder maxPageSearchSize(@Nullable Integer value) {
			this.maxPageSearchSize = value;
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
			Settings::setupSettingsDeserializer, Builder::build);

	protected static void setupSettingsDeserializer(DelegatingDeserializer<Settings.Builder> op) {

		op.add(Builder::datesAsEpochMillis, JsonpDeserializer.booleanDeserializer(), "dates_as_epoch_millis");
		op.add(Builder::docsPerSecond, JsonpDeserializer.floatDeserializer(), "docs_per_second");
		op.add(Builder::maxPageSearchSize, JsonpDeserializer.integerDeserializer(), "max_page_search_size");

	}

}
