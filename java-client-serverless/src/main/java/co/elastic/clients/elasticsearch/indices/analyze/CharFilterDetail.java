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

package co.elastic.clients.elasticsearch.indices.analyze;

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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.analyze.CharFilterDetail

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.analyze.CharFilterDetail">API
 *      specification</a>
 */
@JsonpDeserializable
public class CharFilterDetail implements JsonpSerializable {
	private final List<String> filteredText;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	private CharFilterDetail(Builder builder) {

		this.filteredText = ApiTypeHelper.unmodifiableRequired(builder.filteredText, this, "filteredText");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static CharFilterDetail of(Function<Builder, ObjectBuilder<CharFilterDetail>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code filtered_text}
	 */
	public final List<String> filteredText() {
		return this.filteredText;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
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

		if (ApiTypeHelper.isDefined(this.filteredText)) {
			generator.writeKey("filtered_text");
			generator.writeStartArray();
			for (String item0 : this.filteredText) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("name");
		generator.write(this.name);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CharFilterDetail}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CharFilterDetail> {
		private List<String> filteredText;

		private String name;

		/**
		 * Required - API name: {@code filtered_text}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>filteredText</code>.
		 */
		public final Builder filteredText(List<String> list) {
			this.filteredText = _listAddAll(this.filteredText, list);
			return this;
		}

		/**
		 * Required - API name: {@code filtered_text}
		 * <p>
		 * Adds one or more values to <code>filteredText</code>.
		 */
		public final Builder filteredText(String value, String... values) {
			this.filteredText = _listAdd(this.filteredText, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CharFilterDetail}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CharFilterDetail build() {
			_checkSingleUse();

			return new CharFilterDetail(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CharFilterDetail}
	 */
	public static final JsonpDeserializer<CharFilterDetail> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CharFilterDetail::setupCharFilterDetailDeserializer);

	protected static void setupCharFilterDetailDeserializer(ObjectDeserializer<CharFilterDetail.Builder> op) {

		op.add(Builder::filteredText, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"filtered_text");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
