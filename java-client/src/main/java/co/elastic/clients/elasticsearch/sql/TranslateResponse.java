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

package co.elastic.clients.elasticsearch.sql;

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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: sql.translate.Response
@JsonpDeserializable
public class TranslateResponse implements JsonpSerializable {
	private final long size;

	private final JsonValue /*
							 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
							 */ source;

	private final List<Map<String, String>> fields;

	private final List<JsonValue /* _global.search._types.SortCombinations */> sort;

	// ---------------------------------------------------------------------------------------------

	private TranslateResponse(Builder builder) {

		this.size = ModelTypeHelper.requireNonNull(builder.size, this, "size");
		this.source = ModelTypeHelper.requireNonNull(builder.source, this, "source");
		this.fields = ModelTypeHelper.unmodifiableRequired(builder.fields, this, "fields");
		this.sort = ModelTypeHelper.unmodifiableRequired(builder.sort, this, "sort");

	}

	public static TranslateResponse of(Function<Builder, ObjectBuilder<TranslateResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code size}
	 */
	public final long size() {
		return this.size;
	}

	/**
	 * Required - API name: {@code _source}
	 */
	public final JsonValue /*
							 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
							 */ source() {
		return this.source;
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public final List<Map<String, String>> fields() {
		return this.fields;
	}

	/**
	 * Required - API name: {@code sort}
	 */
	public final List<JsonValue /* _global.search._types.SortCombinations */> sort() {
		return this.sort;
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

		generator.writeKey("size");
		generator.write(this.size);

		generator.writeKey("_source");
		generator.write(this.source);

		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (Map<String, String> item0 : this.fields) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, String> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						generator.write(item1.getValue());

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue /* _global.search._types.SortCombinations */ item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TranslateResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TranslateResponse> {
		private Long size;

		private JsonValue /*
							 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
							 */ source;

		private List<Map<String, String>> fields;

		private List<JsonValue /* _global.search._types.SortCombinations */> sort;

		/**
		 * Required - API name: {@code size}
		 */
		public final Builder size(long value) {
			this.size = value;
			return this;
		}

		/**
		 * Required - API name: {@code _source}
		 */
		public final Builder source(
				JsonValue /*
							 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
							 */ value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 */
		public final Builder fields(List<Map<String, String>> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 */
		public final Builder fields(Map<String, String>... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code sort}
		 */
		public final Builder sort(List<JsonValue /* _global.search._types.SortCombinations */> value) {
			this.sort = value;
			return this;
		}

		/**
		 * Required - API name: {@code sort}
		 */
		public final Builder sort(JsonValue /* _global.search._types.SortCombinations */... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link TranslateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TranslateResponse build() {
			_checkSingleUse();

			return new TranslateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TranslateResponse}
	 */
	public static final JsonpDeserializer<TranslateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TranslateResponse::setupTranslateResponseDeserializer, Builder::build);

	protected static void setupTranslateResponseDeserializer(DelegatingDeserializer<TranslateResponse.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.longDeserializer(), "size");
		op.add(Builder::source, JsonpDeserializer.jsonValueDeserializer(), "_source");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer())), "fields");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");

	}

}
