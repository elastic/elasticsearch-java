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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DataDescription
public final class DataDescription implements ToJsonp {
	@Nullable
	private final String format;

	private final String timeField;

	@Nullable
	private final String timeFormat;

	@Nullable
	private final String fieldDelimiter;

	// ---------------------------------------------------------------------------------------------

	protected DataDescription(Builder builder) {

		this.format = builder.format;
		this.timeField = Objects.requireNonNull(builder.timeField, "time_field");
		this.timeFormat = builder.timeFormat;
		this.fieldDelimiter = builder.fieldDelimiter;

	}

	/**
	 * Only JSON format is supported at this time.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public String format() {
		return this.format;
	}

	/**
	 * The name of the field that contains the timestamp.
	 * <p>
	 * API name: {@code time_field}
	 */
	public String timeField() {
		return this.timeField;
	}

	/**
	 * The time format, which can be <code>epoch</code>, <code>epoch_ms</code>, or a
	 * custom pattern. The value <code>epoch</code> refers to UNIX or Epoch time
	 * (the number of seconds since 1 Jan 1970). The value <code>epoch_ms</code>
	 * indicates that time is measured in milliseconds since the epoch. The
	 * <code>epoch</code> and <code>epoch_ms</code> time formats accept either
	 * integer or real values. Custom patterns must conform to the Java
	 * DateTimeFormatter class. When you use date-time formatting patterns, it is
	 * recommended that you provide the full date, time and time zone. For example:
	 * yyyy-MM-dd'T'HH:mm:ssX. If the pattern that you specify is not sufficient to
	 * produce a complete timestamp, job creation fails.
	 * <p>
	 * API name: {@code time_format}
	 */
	@Nullable
	public String timeFormat() {
		return this.timeFormat;
	}

	/**
	 * API name: {@code field_delimiter}
	 */
	@Nullable
	public String fieldDelimiter() {
		return this.fieldDelimiter;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.format != null) {

			generator.writeKey("format");
			generator.write(this.format);

		}

		generator.writeKey("time_field");
		generator.write(this.timeField);

		if (this.timeFormat != null) {

			generator.writeKey("time_format");
			generator.write(this.timeFormat);

		}
		if (this.fieldDelimiter != null) {

			generator.writeKey("field_delimiter");
			generator.write(this.fieldDelimiter);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataDescription}.
	 */
	public static class Builder implements ObjectBuilder<DataDescription> {
		@Nullable
		private String format;

		private String timeField;

		@Nullable
		private String timeFormat;

		@Nullable
		private String fieldDelimiter;

		/**
		 * Only JSON format is supported at this time.
		 * <p>
		 * API name: {@code format}
		 */
		public Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * The name of the field that contains the timestamp.
		 * <p>
		 * API name: {@code time_field}
		 */
		public Builder timeField(String value) {
			this.timeField = value;
			return this;
		}

		/**
		 * The time format, which can be <code>epoch</code>, <code>epoch_ms</code>, or a
		 * custom pattern. The value <code>epoch</code> refers to UNIX or Epoch time
		 * (the number of seconds since 1 Jan 1970). The value <code>epoch_ms</code>
		 * indicates that time is measured in milliseconds since the epoch. The
		 * <code>epoch</code> and <code>epoch_ms</code> time formats accept either
		 * integer or real values. Custom patterns must conform to the Java
		 * DateTimeFormatter class. When you use date-time formatting patterns, it is
		 * recommended that you provide the full date, time and time zone. For example:
		 * yyyy-MM-dd'T'HH:mm:ssX. If the pattern that you specify is not sufficient to
		 * produce a complete timestamp, job creation fails.
		 * <p>
		 * API name: {@code time_format}
		 */
		public Builder timeFormat(@Nullable String value) {
			this.timeFormat = value;
			return this;
		}

		/**
		 * API name: {@code field_delimiter}
		 */
		public Builder fieldDelimiter(@Nullable String value) {
			this.fieldDelimiter = value;
			return this;
		}

		/**
		 * Builds a {@link DataDescription}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataDescription build() {

			return new DataDescription(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataDescription
	 */
	public static final JsonpDeserializer<DataDescription> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DataDescription::setupDataDescriptionDeserializer);

	protected static void setupDataDescriptionDeserializer(DelegatingDeserializer<DataDescription.Builder> op) {

		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::timeField, JsonpDeserializer.stringDeserializer(), "time_field");
		op.add(Builder::timeFormat, JsonpDeserializer.stringDeserializer(), "time_format");
		op.add(Builder::fieldDelimiter, JsonpDeserializer.stringDeserializer(), "field_delimiter");

	}

}
