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

package co.elastic.clients.elasticsearch.cluster.stats;

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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.RuntimeFieldTypes

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.RuntimeFieldTypes">API
 *      specification</a>
 */
@JsonpDeserializable
public class RuntimeFieldTypes implements JsonpSerializable {
	private final int charsMax;

	private final int charsTotal;

	private final int count;

	private final int docMax;

	private final int docTotal;

	private final int indexCount;

	private final List<String> lang;

	private final int linesMax;

	private final int linesTotal;

	private final String name;

	private final int scriptlessCount;

	private final int shadowedCount;

	private final int sourceMax;

	private final int sourceTotal;

	// ---------------------------------------------------------------------------------------------

	private RuntimeFieldTypes(Builder builder) {

		this.charsMax = ApiTypeHelper.requireNonNull(builder.charsMax, this, "charsMax");
		this.charsTotal = ApiTypeHelper.requireNonNull(builder.charsTotal, this, "charsTotal");
		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.docMax = ApiTypeHelper.requireNonNull(builder.docMax, this, "docMax");
		this.docTotal = ApiTypeHelper.requireNonNull(builder.docTotal, this, "docTotal");
		this.indexCount = ApiTypeHelper.requireNonNull(builder.indexCount, this, "indexCount");
		this.lang = ApiTypeHelper.unmodifiableRequired(builder.lang, this, "lang");
		this.linesMax = ApiTypeHelper.requireNonNull(builder.linesMax, this, "linesMax");
		this.linesTotal = ApiTypeHelper.requireNonNull(builder.linesTotal, this, "linesTotal");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.scriptlessCount = ApiTypeHelper.requireNonNull(builder.scriptlessCount, this, "scriptlessCount");
		this.shadowedCount = ApiTypeHelper.requireNonNull(builder.shadowedCount, this, "shadowedCount");
		this.sourceMax = ApiTypeHelper.requireNonNull(builder.sourceMax, this, "sourceMax");
		this.sourceTotal = ApiTypeHelper.requireNonNull(builder.sourceTotal, this, "sourceTotal");

	}

	public static RuntimeFieldTypes of(Function<Builder, ObjectBuilder<RuntimeFieldTypes>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Maximum number of characters for a single runtime field script.
	 * <p>
	 * API name: {@code chars_max}
	 */
	public final int charsMax() {
		return this.charsMax;
	}

	/**
	 * Required - Total number of characters for the scripts that define the current
	 * runtime field data type.
	 * <p>
	 * API name: {@code chars_total}
	 */
	public final int charsTotal() {
		return this.charsTotal;
	}

	/**
	 * Required - Number of runtime fields mapped to the field data type in selected
	 * nodes.
	 * <p>
	 * API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - Maximum number of accesses to doc_values for a single runtime
	 * field script
	 * <p>
	 * API name: {@code doc_max}
	 */
	public final int docMax() {
		return this.docMax;
	}

	/**
	 * Required - Total number of accesses to doc_values for the scripts that define
	 * the current runtime field data type.
	 * <p>
	 * API name: {@code doc_total}
	 */
	public final int docTotal() {
		return this.docTotal;
	}

	/**
	 * Required - Number of indices containing a mapping of the runtime field data
	 * type in selected nodes.
	 * <p>
	 * API name: {@code index_count}
	 */
	public final int indexCount() {
		return this.indexCount;
	}

	/**
	 * Required - Script languages used for the runtime fields scripts.
	 * <p>
	 * API name: {@code lang}
	 */
	public final List<String> lang() {
		return this.lang;
	}

	/**
	 * Required - Maximum number of lines for a single runtime field script.
	 * <p>
	 * API name: {@code lines_max}
	 */
	public final int linesMax() {
		return this.linesMax;
	}

	/**
	 * Required - Total number of lines for the scripts that define the current
	 * runtime field data type.
	 * <p>
	 * API name: {@code lines_total}
	 */
	public final int linesTotal() {
		return this.linesTotal;
	}

	/**
	 * Required - Field data type used in selected nodes.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - Number of runtime fields that don’t declare a script.
	 * <p>
	 * API name: {@code scriptless_count}
	 */
	public final int scriptlessCount() {
		return this.scriptlessCount;
	}

	/**
	 * Required - Number of runtime fields that shadow an indexed field.
	 * <p>
	 * API name: {@code shadowed_count}
	 */
	public final int shadowedCount() {
		return this.shadowedCount;
	}

	/**
	 * Required - Maximum number of accesses to _source for a single runtime field
	 * script.
	 * <p>
	 * API name: {@code source_max}
	 */
	public final int sourceMax() {
		return this.sourceMax;
	}

	/**
	 * Required - Total number of accesses to _source for the scripts that define
	 * the current runtime field data type.
	 * <p>
	 * API name: {@code source_total}
	 */
	public final int sourceTotal() {
		return this.sourceTotal;
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

		generator.writeKey("chars_max");
		generator.write(this.charsMax);

		generator.writeKey("chars_total");
		generator.write(this.charsTotal);

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("doc_max");
		generator.write(this.docMax);

		generator.writeKey("doc_total");
		generator.write(this.docTotal);

		generator.writeKey("index_count");
		generator.write(this.indexCount);

		if (ApiTypeHelper.isDefined(this.lang)) {
			generator.writeKey("lang");
			generator.writeStartArray();
			for (String item0 : this.lang) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("lines_max");
		generator.write(this.linesMax);

		generator.writeKey("lines_total");
		generator.write(this.linesTotal);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("scriptless_count");
		generator.write(this.scriptlessCount);

		generator.writeKey("shadowed_count");
		generator.write(this.shadowedCount);

		generator.writeKey("source_max");
		generator.write(this.sourceMax);

		generator.writeKey("source_total");
		generator.write(this.sourceTotal);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RuntimeFieldTypes}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RuntimeFieldTypes> {
		private Integer charsMax;

		private Integer charsTotal;

		private Integer count;

		private Integer docMax;

		private Integer docTotal;

		private Integer indexCount;

		private List<String> lang;

		private Integer linesMax;

		private Integer linesTotal;

		private String name;

		private Integer scriptlessCount;

		private Integer shadowedCount;

		private Integer sourceMax;

		private Integer sourceTotal;

		/**
		 * Required - Maximum number of characters for a single runtime field script.
		 * <p>
		 * API name: {@code chars_max}
		 */
		public final Builder charsMax(int value) {
			this.charsMax = value;
			return this;
		}

		/**
		 * Required - Total number of characters for the scripts that define the current
		 * runtime field data type.
		 * <p>
		 * API name: {@code chars_total}
		 */
		public final Builder charsTotal(int value) {
			this.charsTotal = value;
			return this;
		}

		/**
		 * Required - Number of runtime fields mapped to the field data type in selected
		 * nodes.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - Maximum number of accesses to doc_values for a single runtime
		 * field script
		 * <p>
		 * API name: {@code doc_max}
		 */
		public final Builder docMax(int value) {
			this.docMax = value;
			return this;
		}

		/**
		 * Required - Total number of accesses to doc_values for the scripts that define
		 * the current runtime field data type.
		 * <p>
		 * API name: {@code doc_total}
		 */
		public final Builder docTotal(int value) {
			this.docTotal = value;
			return this;
		}

		/**
		 * Required - Number of indices containing a mapping of the runtime field data
		 * type in selected nodes.
		 * <p>
		 * API name: {@code index_count}
		 */
		public final Builder indexCount(int value) {
			this.indexCount = value;
			return this;
		}

		/**
		 * Required - Script languages used for the runtime fields scripts.
		 * <p>
		 * API name: {@code lang}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>lang</code>.
		 */
		public final Builder lang(List<String> list) {
			this.lang = _listAddAll(this.lang, list);
			return this;
		}

		/**
		 * Required - Script languages used for the runtime fields scripts.
		 * <p>
		 * API name: {@code lang}
		 * <p>
		 * Adds one or more values to <code>lang</code>.
		 */
		public final Builder lang(String value, String... values) {
			this.lang = _listAdd(this.lang, value, values);
			return this;
		}

		/**
		 * Required - Maximum number of lines for a single runtime field script.
		 * <p>
		 * API name: {@code lines_max}
		 */
		public final Builder linesMax(int value) {
			this.linesMax = value;
			return this;
		}

		/**
		 * Required - Total number of lines for the scripts that define the current
		 * runtime field data type.
		 * <p>
		 * API name: {@code lines_total}
		 */
		public final Builder linesTotal(int value) {
			this.linesTotal = value;
			return this;
		}

		/**
		 * Required - Field data type used in selected nodes.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - Number of runtime fields that don’t declare a script.
		 * <p>
		 * API name: {@code scriptless_count}
		 */
		public final Builder scriptlessCount(int value) {
			this.scriptlessCount = value;
			return this;
		}

		/**
		 * Required - Number of runtime fields that shadow an indexed field.
		 * <p>
		 * API name: {@code shadowed_count}
		 */
		public final Builder shadowedCount(int value) {
			this.shadowedCount = value;
			return this;
		}

		/**
		 * Required - Maximum number of accesses to _source for a single runtime field
		 * script.
		 * <p>
		 * API name: {@code source_max}
		 */
		public final Builder sourceMax(int value) {
			this.sourceMax = value;
			return this;
		}

		/**
		 * Required - Total number of accesses to _source for the scripts that define
		 * the current runtime field data type.
		 * <p>
		 * API name: {@code source_total}
		 */
		public final Builder sourceTotal(int value) {
			this.sourceTotal = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RuntimeFieldTypes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RuntimeFieldTypes build() {
			_checkSingleUse();

			return new RuntimeFieldTypes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RuntimeFieldTypes}
	 */
	public static final JsonpDeserializer<RuntimeFieldTypes> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RuntimeFieldTypes::setupRuntimeFieldTypesDeserializer);

	protected static void setupRuntimeFieldTypesDeserializer(ObjectDeserializer<RuntimeFieldTypes.Builder> op) {

		op.add(Builder::charsMax, JsonpDeserializer.integerDeserializer(), "chars_max");
		op.add(Builder::charsTotal, JsonpDeserializer.integerDeserializer(), "chars_total");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::docMax, JsonpDeserializer.integerDeserializer(), "doc_max");
		op.add(Builder::docTotal, JsonpDeserializer.integerDeserializer(), "doc_total");
		op.add(Builder::indexCount, JsonpDeserializer.integerDeserializer(), "index_count");
		op.add(Builder::lang, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "lang");
		op.add(Builder::linesMax, JsonpDeserializer.integerDeserializer(), "lines_max");
		op.add(Builder::linesTotal, JsonpDeserializer.integerDeserializer(), "lines_total");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::scriptlessCount, JsonpDeserializer.integerDeserializer(), "scriptless_count");
		op.add(Builder::shadowedCount, JsonpDeserializer.integerDeserializer(), "shadowed_count");
		op.add(Builder::sourceMax, JsonpDeserializer.integerDeserializer(), "source_max");
		op.add(Builder::sourceTotal, JsonpDeserializer.integerDeserializer(), "source_total");

	}

}
