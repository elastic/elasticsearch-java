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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.RuntimeFieldTypes
@JsonpDeserializable
public class RuntimeFieldTypes implements JsonpSerializable {
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

	private RuntimeFieldTypes(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.indexCount = ModelTypeHelper.requireNonNull(builder.indexCount, this, "indexCount");
		this.scriptlessCount = ModelTypeHelper.requireNonNull(builder.scriptlessCount, this, "scriptlessCount");
		this.shadowedCount = ModelTypeHelper.requireNonNull(builder.shadowedCount, this, "shadowedCount");
		this.lang = ModelTypeHelper.unmodifiableRequired(builder.lang, this, "lang");
		this.linesMax = ModelTypeHelper.requireNonNull(builder.linesMax, this, "linesMax");
		this.linesTotal = ModelTypeHelper.requireNonNull(builder.linesTotal, this, "linesTotal");
		this.charsMax = ModelTypeHelper.requireNonNull(builder.charsMax, this, "charsMax");
		this.charsTotal = ModelTypeHelper.requireNonNull(builder.charsTotal, this, "charsTotal");
		this.sourceMax = ModelTypeHelper.requireNonNull(builder.sourceMax, this, "sourceMax");
		this.sourceTotal = ModelTypeHelper.requireNonNull(builder.sourceTotal, this, "sourceTotal");
		this.docMax = ModelTypeHelper.requireNonNull(builder.docMax, this, "docMax");
		this.docTotal = ModelTypeHelper.requireNonNull(builder.docTotal, this, "docTotal");

	}

	public static RuntimeFieldTypes of(Function<Builder, ObjectBuilder<RuntimeFieldTypes>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code index_count}
	 */
	public final int indexCount() {
		return this.indexCount;
	}

	/**
	 * Required - API name: {@code scriptless_count}
	 */
	public final int scriptlessCount() {
		return this.scriptlessCount;
	}

	/**
	 * Required - API name: {@code shadowed_count}
	 */
	public final int shadowedCount() {
		return this.shadowedCount;
	}

	/**
	 * Required - API name: {@code lang}
	 */
	public final List<String> lang() {
		return this.lang;
	}

	/**
	 * Required - API name: {@code lines_max}
	 */
	public final int linesMax() {
		return this.linesMax;
	}

	/**
	 * Required - API name: {@code lines_total}
	 */
	public final int linesTotal() {
		return this.linesTotal;
	}

	/**
	 * Required - API name: {@code chars_max}
	 */
	public final int charsMax() {
		return this.charsMax;
	}

	/**
	 * Required - API name: {@code chars_total}
	 */
	public final int charsTotal() {
		return this.charsTotal;
	}

	/**
	 * Required - API name: {@code source_max}
	 */
	public final int sourceMax() {
		return this.sourceMax;
	}

	/**
	 * Required - API name: {@code source_total}
	 */
	public final int sourceTotal() {
		return this.sourceTotal;
	}

	/**
	 * Required - API name: {@code doc_max}
	 */
	public final int docMax() {
		return this.docMax;
	}

	/**
	 * Required - API name: {@code doc_total}
	 */
	public final int docTotal() {
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

		if (ModelTypeHelper.isDefined(this.lang)) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RuntimeFieldTypes> {
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
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_count}
		 */
		public final Builder indexCount(int value) {
			this.indexCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code scriptless_count}
		 */
		public final Builder scriptlessCount(int value) {
			this.scriptlessCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code shadowed_count}
		 */
		public final Builder shadowedCount(int value) {
			this.shadowedCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code lang}
		 */
		public final Builder lang(List<String> value) {
			this.lang = value;
			return this;
		}

		/**
		 * Required - API name: {@code lang}
		 */
		public final Builder lang(String... value) {
			this.lang = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code lines_max}
		 */
		public final Builder linesMax(int value) {
			this.linesMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code lines_total}
		 */
		public final Builder linesTotal(int value) {
			this.linesTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code chars_max}
		 */
		public final Builder charsMax(int value) {
			this.charsMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code chars_total}
		 */
		public final Builder charsTotal(int value) {
			this.charsTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code source_max}
		 */
		public final Builder sourceMax(int value) {
			this.sourceMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code source_total}
		 */
		public final Builder sourceTotal(int value) {
			this.sourceTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code doc_max}
		 */
		public final Builder docMax(int value) {
			this.docMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code doc_total}
		 */
		public final Builder docTotal(int value) {
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
			_checkSingleUse();

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
