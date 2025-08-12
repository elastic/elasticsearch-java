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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.NamedValue;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
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

	private final List<NamedValue<HighlightField>> fields;

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
	public final List<NamedValue<HighlightField>> fields() {
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
			generator.writeStartArray();
			for (NamedValue<HighlightField> item0 : this.fields) {
				generator.writeStartObject();
				generator.writeKey(item0.name());
				item0.value().serialize(generator, mapper);

				generator.writeEnd();

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

		private List<NamedValue<HighlightField>> fields;

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
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<NamedValue<HighlightField>> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		@SafeVarargs
		public final Builder fields(NamedValue<HighlightField> value, NamedValue<HighlightField>... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
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
		op.add(Builder::fields,
				JsonpDeserializer.arrayDeserializer(NamedValue.deserializer(() -> HighlightField._DESERIALIZER)),
				"fields");

	}

}
