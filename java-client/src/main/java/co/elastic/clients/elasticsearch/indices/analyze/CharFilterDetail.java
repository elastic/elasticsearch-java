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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.analyze.CharFilterDetail
@JsonpDeserializable
public final class CharFilterDetail implements JsonpSerializable {
	private final List<String> filteredText;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	public CharFilterDetail(Builder builder) {

		this.filteredText = Objects.requireNonNull(builder.filteredText, "filtered_text");
		this.name = Objects.requireNonNull(builder.name, "name");

	}

	/**
	 * API name: {@code filtered_text}
	 */
	public List<String> filteredText() {
		return this.filteredText;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
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

		generator.writeKey("filtered_text");
		generator.writeStartArray();
		for (String item0 : this.filteredText) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("name");
		generator.write(this.name);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CharFilterDetail}.
	 */
	public static class Builder implements ObjectBuilder<CharFilterDetail> {
		private List<String> filteredText;

		private String name;

		/**
		 * API name: {@code filtered_text}
		 */
		public Builder filteredText(List<String> value) {
			this.filteredText = value;
			return this;
		}

		/**
		 * API name: {@code filtered_text}
		 */
		public Builder filteredText(String... value) {
			this.filteredText = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #filteredText(List)}, creating the list if needed.
		 */
		public Builder addFilteredText(String value) {
			if (this.filteredText == null) {
				this.filteredText = new ArrayList<>();
			}
			this.filteredText.add(value);
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link CharFilterDetail}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CharFilterDetail build() {

			return new CharFilterDetail(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CharFilterDetail}
	 */
	public static final JsonpDeserializer<CharFilterDetail> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CharFilterDetail::setupCharFilterDetailDeserializer, Builder::build);

	protected static void setupCharFilterDetailDeserializer(DelegatingDeserializer<CharFilterDetail.Builder> op) {

		op.add(Builder::filteredText, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"filtered_text");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
