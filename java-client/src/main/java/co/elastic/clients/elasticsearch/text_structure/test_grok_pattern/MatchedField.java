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

package co.elastic.clients.elasticsearch.text_structure.test_grok_pattern;

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
import java.lang.Integer;
import java.lang.String;
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

// typedef: text_structure.test_grok_pattern.MatchedField

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#text_structure.test_grok_pattern.MatchedField">API
 *      specification</a>
 */
@JsonpDeserializable
public class MatchedField implements JsonpSerializable {
	private final String match;

	private final int offset;

	private final int length;

	// ---------------------------------------------------------------------------------------------

	private MatchedField(Builder builder) {

		this.match = ApiTypeHelper.requireNonNull(builder.match, this, "match");
		this.offset = ApiTypeHelper.requireNonNull(builder.offset, this, "offset");
		this.length = ApiTypeHelper.requireNonNull(builder.length, this, "length");

	}

	public static MatchedField of(Function<Builder, ObjectBuilder<MatchedField>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code match}
	 */
	public final String match() {
		return this.match;
	}

	/**
	 * Required - API name: {@code offset}
	 */
	public final int offset() {
		return this.offset;
	}

	/**
	 * Required - API name: {@code length}
	 */
	public final int length() {
		return this.length;
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

		generator.writeKey("match");
		generator.write(this.match);

		generator.writeKey("offset");
		generator.write(this.offset);

		generator.writeKey("length");
		generator.write(this.length);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatchedField}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MatchedField> {
		private String match;

		private Integer offset;

		private Integer length;

		/**
		 * Required - API name: {@code match}
		 */
		public final Builder match(String value) {
			this.match = value;
			return this;
		}

		/**
		 * Required - API name: {@code offset}
		 */
		public final Builder offset(int value) {
			this.offset = value;
			return this;
		}

		/**
		 * Required - API name: {@code length}
		 */
		public final Builder length(int value) {
			this.length = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MatchedField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatchedField build() {
			_checkSingleUse();

			return new MatchedField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatchedField}
	 */
	public static final JsonpDeserializer<MatchedField> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MatchedField::setupMatchedFieldDeserializer);

	protected static void setupMatchedFieldDeserializer(ObjectDeserializer<MatchedField.Builder> op) {

		op.add(Builder::match, JsonpDeserializer.stringDeserializer(), "match");
		op.add(Builder::offset, JsonpDeserializer.integerDeserializer(), "offset");
		op.add(Builder::length, JsonpDeserializer.integerDeserializer(), "length");

	}

}
