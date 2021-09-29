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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.search._types.Suggest

public final class Suggestion<T> implements JsonpSerializable {
	private final int length;

	private final int offset;

	private final List<JsonValue /* _global.search._types.SuggestOption<_global.search._types.T> */> options;

	private final String text;

	@Nullable
	private final JsonpSerializer<T> tSerializer;

	// ---------------------------------------------------------------------------------------------

	public Suggestion(Builder<T> builder) {

		this.length = Objects.requireNonNull(builder.length, "length");
		this.offset = Objects.requireNonNull(builder.offset, "offset");
		this.options = ModelTypeHelper.unmodifiableNonNull(builder.options, "options");
		this.text = Objects.requireNonNull(builder.text, "text");
		this.tSerializer = builder.tSerializer;

	}

	public Suggestion(Function<Builder<T>, Builder<T>> fn) {
		this(fn.apply(new Builder<>()));
	}

	/**
	 * API name: {@code length}
	 */
	public int length() {
		return this.length;
	}

	/**
	 * API name: {@code offset}
	 */
	public int offset() {
		return this.offset;
	}

	/**
	 * API name: {@code options}
	 */
	public List<JsonValue /* _global.search._types.SuggestOption<_global.search._types.T> */> options() {
		return this.options;
	}

	/**
	 * API name: {@code text}
	 */
	public String text() {
		return this.text;
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

		generator.writeKey("length");
		generator.write(this.length);

		generator.writeKey("offset");
		generator.write(this.offset);

		generator.writeKey("options");
		generator.writeStartArray();
		for (JsonValue /* _global.search._types.SuggestOption<_global.search._types.T> */ item0 : this.options) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("text");
		generator.write(this.text);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Suggestion}.
	 */
	public static class Builder<T> implements ObjectBuilder<Suggestion<T>> {
		private Integer length;

		private Integer offset;

		private List<JsonValue /* _global.search._types.SuggestOption<_global.search._types.T> */> options;

		private String text;

		@Nullable
		private JsonpSerializer<T> tSerializer;

		/**
		 * API name: {@code length}
		 */
		public Builder<T> length(int value) {
			this.length = value;
			return this;
		}

		/**
		 * API name: {@code offset}
		 */
		public Builder<T> offset(int value) {
			this.offset = value;
			return this;
		}

		/**
		 * API name: {@code options}
		 */
		public Builder<T> options(
				List<JsonValue /* _global.search._types.SuggestOption<_global.search._types.T> */> value) {
			this.options = value;
			return this;
		}

		/**
		 * API name: {@code options}
		 */
		public Builder<T> options(
				JsonValue /* _global.search._types.SuggestOption<_global.search._types.T> */... value) {
			this.options = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #options(List)}, creating the list if needed. 4
		 */
		public Builder<T> addOptions(
				JsonValue /* _global.search._types.SuggestOption<_global.search._types.T> */ value) {
			if (this.options == null) {
				this.options = new ArrayList<>();
			}
			this.options.add(value);
			return this;
		}

		/**
		 * API name: {@code text}
		 */
		public Builder<T> text(String value) {
			this.text = value;
			return this;
		}

		/**
		 * Serializer for T. If not set, an attempt will be made to find a serializer
		 * from the JSON context.
		 */
		public Builder<T> tSerializer(@Nullable JsonpSerializer<T> value) {
			this.tSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link Suggestion}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Suggestion<T> build() {

			return new Suggestion<T>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for Suggestion
	 */
	public static <T> JsonpDeserializer<Suggestion<T>> createSuggestionDeserializer(
			JsonpDeserializer<T> tDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<T>>) Builder::new,
				op -> Suggestion.setupSuggestionDeserializer(op, tDeserializer));
	};

	protected static <T> void setupSuggestionDeserializer(DelegatingDeserializer<Suggestion.Builder<T>> op,
			JsonpDeserializer<T> tDeserializer) {

		op.add(Builder::length, JsonpDeserializer.integerDeserializer(), "length");
		op.add(Builder::offset, JsonpDeserializer.integerDeserializer(), "offset");
		op.add(Builder::options, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"options");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");

	}

}
