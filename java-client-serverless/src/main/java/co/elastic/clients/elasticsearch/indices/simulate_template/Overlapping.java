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

package co.elastic.clients.elasticsearch.indices.simulate_template;

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

// typedef: indices.simulate_template.Overlapping

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.simulate_template.Overlapping">API
 *      specification</a>
 */
@JsonpDeserializable
public class Overlapping implements JsonpSerializable {
	private final String name;

	private final List<String> indexPatterns;

	// ---------------------------------------------------------------------------------------------

	private Overlapping(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.indexPatterns = ApiTypeHelper.unmodifiableRequired(builder.indexPatterns, this, "indexPatterns");

	}

	public static Overlapping of(Function<Builder, ObjectBuilder<Overlapping>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code index_patterns}
	 */
	public final List<String> indexPatterns() {
		return this.indexPatterns;
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

		generator.writeKey("name");
		generator.write(this.name);

		if (ApiTypeHelper.isDefined(this.indexPatterns)) {
			generator.writeKey("index_patterns");
			generator.writeStartArray();
			for (String item0 : this.indexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Overlapping}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Overlapping> {
		private String name;

		private List<String> indexPatterns;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_patterns}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indexPatterns</code>.
		 */
		public final Builder indexPatterns(List<String> list) {
			this.indexPatterns = _listAddAll(this.indexPatterns, list);
			return this;
		}

		/**
		 * Required - API name: {@code index_patterns}
		 * <p>
		 * Adds one or more values to <code>indexPatterns</code>.
		 */
		public final Builder indexPatterns(String value, String... values) {
			this.indexPatterns = _listAdd(this.indexPatterns, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Overlapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Overlapping build() {
			_checkSingleUse();

			return new Overlapping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Overlapping}
	 */
	public static final JsonpDeserializer<Overlapping> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Overlapping::setupOverlappingDeserializer);

	protected static void setupOverlappingDeserializer(ObjectDeserializer<Overlapping.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::indexPatterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"index_patterns");

	}

}
