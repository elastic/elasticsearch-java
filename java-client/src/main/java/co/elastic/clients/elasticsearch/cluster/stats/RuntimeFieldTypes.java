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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.RuntimeFieldTypes
@JsonpDeserializable
public final class RuntimeFieldTypes implements JsonpSerializable {
	private final String name;

	private final int count;

	private final int indexCount;

	private final int scriptlessCount;

	private final int shadowedCount;

	private final List<String> lang;

	private final int linesMax;

	private final int linesTotal;

	private final int charsMax;

	private final int charsTotal;

	private final int sourceMax;

	private final int sourceTotal;

	private final int docMax;

	private final int docTotal;

	// ---------------------------------------------------------------------------------------------

	public RuntimeFieldTypes(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.count = Objects.requireNonNull(builder.count, "count");
		this.indexCount = Objects.requireNonNull(builder.indexCount, "index_count");
		this.scriptlessCount = Objects.requireNonNull(builder.scriptlessCount, "scriptless_count");
		this.shadowedCount = Objects.requireNonNull(builder.shadowedCount, "shadowed_count");
		this.lang = ModelTypeHelper.unmodifiableNonNull(builder.lang, "lang");
		this.linesMax = Objects.requireNonNull(builder.linesMax, "lines_max");
		this.linesTotal = Objects.requireNonNull(builder.linesTotal, "lines_total");
		this.charsMax = Objects.requireNonNull(builder.charsMax, "chars_max");
		this.charsTotal = Objects.requireNonNull(builder.charsTotal, "chars_total");
		this.sourceMax = Objects.requireNonNull(builder.sourceMax, "source_max");
		this.sourceTotal = Objects.requireNonNull(builder.sourceTotal, "source_total");
		this.docMax = Objects.requireNonNull(builder.docMax, "doc_max");
		this.docTotal = Objects.requireNonNull(builder.docTotal, "doc_total");

	}

	public RuntimeFieldTypes(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code index_count}
	 */
	public int indexCount() {
		return this.indexCount;
	}

	/**
	 * Required - API name: {@code scriptless_count}
	 */
	public int scriptlessCount() {
		return this.scriptlessCount;
	}

	/**
	 * Required - API name: {@code shadowed_count}
	 */
	public int shadowedCount() {
		return this.shadowedCount;
	}

	/**
	 * Required - API name: {@code lang}
	 */
	public List<String> lang() {
		return this.lang;
	}

	/**
	 * Required - API name: {@code lines_max}
	 */
	public int linesMax() {
		return this.linesMax;
	}

	/**
	 * Required - API name: {@code lines_total}
	 */
	public int linesTotal() {
		return this.linesTotal;
	}

	/**
	 * Required - API name: {@code chars_max}
	 */
	public int charsMax() {
		return this.charsMax;
	}

	/**
	 * Required - API name: {@code chars_total}
	 */
	public int charsTotal() {
		return this.charsTotal;
	}

	/**
	 * Required - API name: {@code source_max}
	 */
	public int sourceMax() {
		return this.sourceMax;
	}

	/**
	 * Required - API name: {@code source_total}
	 */
	public int sourceTotal() {
		return this.sourceTotal;
	}

	/**
	 * Required - API name: {@code doc_max}
	 */
	public int docMax() {
		return this.docMax;
	}

	/**
	 * Required - API name: {@code doc_total}
	 */
	public int docTotal() {
		return this.docTotal;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("index_count");
		generator.write(this.indexCount);

		generator.writeKey("scriptless_count");
		generator.write(this.scriptlessCount);

		generator.writeKey("shadowed_count");
		generator.write(this.shadowedCount);

		generator.writeKey("lang");
		generator.writeStartArray();
		for (String item0 : this.lang) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("lines_max");
		generator.write(this.linesMax);

		generator.writeKey("lines_total");
		generator.write(this.linesTotal);

		generator.writeKey("chars_max");
		generator.write(this.charsMax);

		generator.writeKey("chars_total");
		generator.write(this.charsTotal);

		generator.writeKey("source_max");
		generator.write(this.sourceMax);

		generator.writeKey("source_total");
		generator.write(this.sourceTotal);

		generator.writeKey("doc_max");
		generator.write(this.docMax);

		generator.writeKey("doc_total");
		generator.write(this.docTotal);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RuntimeFieldTypes}.
	 */
	public static class Builder implements ObjectBuilder<RuntimeFieldTypes> {
		private String name;

		private Integer count;

		private Integer indexCount;

		private Integer scriptlessCount;

		private Integer shadowedCount;

		private List<String> lang;

		private Integer linesMax;

		private Integer linesTotal;

		private Integer charsMax;

		private Integer charsTotal;

		private Integer sourceMax;

		private Integer sourceTotal;

		private Integer docMax;

		private Integer docTotal;

		/**
		 * Required - API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_count}
		 */
		public Builder indexCount(int value) {
			this.indexCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code scriptless_count}
		 */
		public Builder scriptlessCount(int value) {
			this.scriptlessCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code shadowed_count}
		 */
		public Builder shadowedCount(int value) {
			this.shadowedCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code lang}
		 */
		public Builder lang(List<String> value) {
			this.lang = value;
			return this;
		}

		/**
		 * Required - API name: {@code lang}
		 */
		public Builder lang(String... value) {
			this.lang = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #lang(List)}, creating the list if needed.
		 */
		public Builder addLang(String value) {
			if (this.lang == null) {
				this.lang = new ArrayList<>();
			}
			this.lang.add(value);
			return this;
		}

		/**
		 * Required - API name: {@code lines_max}
		 */
		public Builder linesMax(int value) {
			this.linesMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code lines_total}
		 */
		public Builder linesTotal(int value) {
			this.linesTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code chars_max}
		 */
		public Builder charsMax(int value) {
			this.charsMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code chars_total}
		 */
		public Builder charsTotal(int value) {
			this.charsTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code source_max}
		 */
		public Builder sourceMax(int value) {
			this.sourceMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code source_total}
		 */
		public Builder sourceTotal(int value) {
			this.sourceTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code doc_max}
		 */
		public Builder docMax(int value) {
			this.docMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code doc_total}
		 */
		public Builder docTotal(int value) {
			this.docTotal = value;
			return this;
		}

		/**
		 * Builds a {@link RuntimeFieldTypes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RuntimeFieldTypes build() {

			return new RuntimeFieldTypes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RuntimeFieldTypes}
	 */
	public static final JsonpDeserializer<RuntimeFieldTypes> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RuntimeFieldTypes::setupRuntimeFieldTypesDeserializer, Builder::build);

	protected static void setupRuntimeFieldTypesDeserializer(DelegatingDeserializer<RuntimeFieldTypes.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::indexCount, JsonpDeserializer.integerDeserializer(), "index_count");
		op.add(Builder::scriptlessCount, JsonpDeserializer.integerDeserializer(), "scriptless_count");
		op.add(Builder::shadowedCount, JsonpDeserializer.integerDeserializer(), "shadowed_count");
		op.add(Builder::lang, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "lang");
		op.add(Builder::linesMax, JsonpDeserializer.integerDeserializer(), "lines_max");
		op.add(Builder::linesTotal, JsonpDeserializer.integerDeserializer(), "lines_total");
		op.add(Builder::charsMax, JsonpDeserializer.integerDeserializer(), "chars_max");
		op.add(Builder::charsTotal, JsonpDeserializer.integerDeserializer(), "chars_total");
		op.add(Builder::sourceMax, JsonpDeserializer.integerDeserializer(), "source_max");
		op.add(Builder::sourceTotal, JsonpDeserializer.integerDeserializer(), "source_total");
		op.add(Builder::docMax, JsonpDeserializer.integerDeserializer(), "doc_max");
		op.add(Builder::docTotal, JsonpDeserializer.integerDeserializer(), "doc_total");

	}

}
