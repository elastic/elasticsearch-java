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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.Suggester
@JsonpDeserializable
public class Suggester implements JsonpSerializable {
	private final Map<String, FieldSuggester> suggesters;

	@Nullable
	private final String text;

	// ---------------------------------------------------------------------------------------------

	private Suggester(Builder builder) {

		this.suggesters = ModelTypeHelper.unmodifiable(builder.suggesters);

		this.text = builder.text;

	}

	public static Suggester of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * The named suggesters
	 */
	public final Map<String, FieldSuggester> suggesters() {
		return this.suggesters;
	}

	/**
	 * Global suggest text, to avoid repetition when the same text is used in
	 * several suggesters
	 * <p>
	 * API name: {@code text}
	 */
	@Nullable
	public final String text() {
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

		for (Map.Entry<String, FieldSuggester> item0 : this.suggesters.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}

		if (this.text != null) {
			generator.writeKey("text");
			generator.write(this.text);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Suggester}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Suggester> {
		@Nullable
		private Map<String, FieldSuggester> suggesters = new HashMap<>();

		/**
		 * The named suggesters
		 */
		public final Builder suggesters(@Nullable Map<String, FieldSuggester> value) {
			this.suggesters = value;
			return this;
		}

		public final Builder suggesters(
				Function<MapBuilder<String, FieldSuggester, FieldSuggester.Builder>, ObjectBuilder<Map<String, FieldSuggester>>> fn) {
			return suggesters(fn.apply(new MapBuilder<>(FieldSuggester.Builder::new)).build());
		}

		@Nullable
		private String text;

		/**
		 * Global suggest text, to avoid repetition when the same text is used in
		 * several suggesters
		 * <p>
		 * API name: {@code text}
		 */
		public final Builder text(@Nullable String value) {
			this.text = value;
			return this;
		}

		/**
		 * Builds a {@link Suggester}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Suggester build() {
			_checkSingleUse();

			return new Suggester(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Suggester}
	 */
	public static final JsonpDeserializer<Suggester> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Suggester::setupSuggesterDeserializer);

	protected static void setupSuggesterDeserializer(ObjectDeserializer<Suggester.Builder> op) {

		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			if (builder.suggesters == null) {
				builder.suggesters = new HashMap<>();
			}
			builder.suggesters.put(name, FieldSuggester._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
