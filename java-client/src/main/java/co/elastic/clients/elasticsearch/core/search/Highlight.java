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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.Highlight

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.Highlight">API
 *      specification</a>
 */
@JsonpDeserializable
public class Highlight extends HighlightBase {
	@Nullable
	private final HighlighterEncoder encoder;

	private final Map<String, HighlightField> fields;

	// ---------------------------------------------------------------------------------------------

	private Highlight(Builder builder) {
		super(builder);

		this.encoder = builder.encoder;
		this.fields = ApiTypeHelper.unmodifiableRequired(builder.fields, this, "fields");

	}

	public static Highlight of(Function<Builder, ObjectBuilder<Highlight>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code encoder}
	 */
	@Nullable
	public final HighlighterEncoder encoder() {
		return this.encoder;
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public final Map<String, HighlightField> fields() {
		return this.fields;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.encoder != null) {
			generator.writeKey("encoder");
			this.encoder.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, HighlightField> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Highlight}.
	 */

	public static class Builder extends HighlightBase.AbstractBuilder<Builder> implements ObjectBuilder<Highlight> {
		@Nullable
		private HighlighterEncoder encoder;

		private Map<String, HighlightField> fields;

		/**
		 * API name: {@code encoder}
		 */
		public final Builder encoder(@Nullable HighlighterEncoder value) {
			this.encoder = value;
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final Builder fields(Map<String, HighlightField> map) {
			this.fields = _mapPutAll(this.fields, map);
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final Builder fields(String key, HighlightField value) {
			this.fields = _mapPut(this.fields, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code> using a builder lambda.
		 */
		public final Builder fields(String key, Function<HighlightField.Builder, ObjectBuilder<HighlightField>> fn) {
			return fields(key, fn.apply(new HighlightField.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Highlight}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Highlight build() {
			_checkSingleUse();

			return new Highlight(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Highlight}
	 */
	public static final JsonpDeserializer<Highlight> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Highlight::setupHighlightDeserializer);

	protected static void setupHighlightDeserializer(ObjectDeserializer<Highlight.Builder> op) {
		HighlightBase.setupHighlightBaseDeserializer(op);
		op.add(Builder::encoder, HighlighterEncoder._DESERIALIZER, "encoder");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(HighlightField._DESERIALIZER), "fields");

	}

}
