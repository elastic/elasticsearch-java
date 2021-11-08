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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.FieldAndFormat
@JsonpDeserializable
public class FieldAndFormat implements JsonpSerializable {
	private final String field;

	@Nullable
	private final String format;

	@Nullable
	private final Boolean includeUnmapped;

	// ---------------------------------------------------------------------------------------------

	private FieldAndFormat(Builder builder) {

		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.format = builder.format;
		this.includeUnmapped = builder.includeUnmapped;

	}

	public static FieldAndFormat of(Function<Builder, ObjectBuilder<FieldAndFormat>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * API name: {@code include_unmapped}
	 */
	@Nullable
	public final Boolean includeUnmapped() {
		return this.includeUnmapped;
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

		generator.writeKey("field");
		generator.write(this.field);

		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.includeUnmapped != null) {
			generator.writeKey("include_unmapped");
			generator.write(this.includeUnmapped);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldAndFormat}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FieldAndFormat> {
		private String field;

		@Nullable
		private String format;

		@Nullable
		private Boolean includeUnmapped;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code include_unmapped}
		 */
		public final Builder includeUnmapped(@Nullable Boolean value) {
			this.includeUnmapped = value;
			return this;
		}

		/**
		 * Builds a {@link FieldAndFormat}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldAndFormat build() {
			_checkSingleUse();

			return new FieldAndFormat(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldAndFormat}
	 */
	public static final JsonpDeserializer<FieldAndFormat> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldAndFormat::setupFieldAndFormatDeserializer, Builder::build);

	protected static void setupFieldAndFormatDeserializer(DelegatingDeserializer<FieldAndFormat.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::includeUnmapped, JsonpDeserializer.booleanDeserializer(), "include_unmapped");

		op.shortcutProperty("field");

	}

}
