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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.stats.RuntimeFieldTypes
public final class RuntimeFieldTypes implements JsonpSerializable {
	private final String name;

	private final Number count;

	private final Number indexCount;

	private final Number scriptlessCount;

	private final Number shadowedCount;

	private final List<String> lang;

	private final Number linesMax;

	private final Number linesTotal;

	private final Number charsMax;

	private final Number charsTotal;

	private final Number sourceMax;

	private final Number sourceTotal;

	private final Number docMax;

	private final Number docTotal;

	// ---------------------------------------------------------------------------------------------

	public RuntimeFieldTypes(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.count = Objects.requireNonNull(builder.count, "count");
		this.indexCount = Objects.requireNonNull(builder.indexCount, "index_count");
		this.scriptlessCount = Objects.requireNonNull(builder.scriptlessCount, "scriptless_count");
		this.shadowedCount = Objects.requireNonNull(builder.shadowedCount, "shadowed_count");
		this.lang = Objects.requireNonNull(builder.lang, "lang");
		this.linesMax = Objects.requireNonNull(builder.linesMax, "lines_max");
		this.linesTotal = Objects.requireNonNull(builder.linesTotal, "lines_total");
		this.charsMax = Objects.requireNonNull(builder.charsMax, "chars_max");
		this.charsTotal = Objects.requireNonNull(builder.charsTotal, "chars_total");
		this.sourceMax = Objects.requireNonNull(builder.sourceMax, "source_max");
		this.sourceTotal = Objects.requireNonNull(builder.sourceTotal, "source_total");
		this.docMax = Objects.requireNonNull(builder.docMax, "doc_max");
		this.docTotal = Objects.requireNonNull(builder.docTotal, "doc_total");

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code index_count}
	 */
	public Number indexCount() {
		return this.indexCount;
	}

	/**
	 * API name: {@code scriptless_count}
	 */
	public Number scriptlessCount() {
		return this.scriptlessCount;
	}

	/**
	 * API name: {@code shadowed_count}
	 */
	public Number shadowedCount() {
		return this.shadowedCount;
	}

	/**
	 * API name: {@code lang}
	 */
	public List<String> lang() {
		return this.lang;
	}

	/**
	 * API name: {@code lines_max}
	 */
	public Number linesMax() {
		return this.linesMax;
	}

	/**
	 * API name: {@code lines_total}
	 */
	public Number linesTotal() {
		return this.linesTotal;
	}

	/**
	 * API name: {@code chars_max}
	 */
	public Number charsMax() {
		return this.charsMax;
	}

	/**
	 * API name: {@code chars_total}
	 */
	public Number charsTotal() {
		return this.charsTotal;
	}

	/**
	 * API name: {@code source_max}
	 */
	public Number sourceMax() {
		return this.sourceMax;
	}

	/**
	 * API name: {@code source_total}
	 */
	public Number sourceTotal() {
		return this.sourceTotal;
	}

	/**
	 * API name: {@code doc_max}
	 */
	public Number docMax() {
		return this.docMax;
	}

	/**
	 * API name: {@code doc_total}
	 */
	public Number docTotal() {
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
		generator.write(this.count.doubleValue());

		generator.writeKey("index_count");
		generator.write(this.indexCount.doubleValue());

		generator.writeKey("scriptless_count");
		generator.write(this.scriptlessCount.doubleValue());

		generator.writeKey("shadowed_count");
		generator.write(this.shadowedCount.doubleValue());

		generator.writeKey("lang");
		generator.writeStartArray();
		for (String item0 : this.lang) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("lines_max");
		generator.write(this.linesMax.doubleValue());

		generator.writeKey("lines_total");
		generator.write(this.linesTotal.doubleValue());

		generator.writeKey("chars_max");
		generator.write(this.charsMax.doubleValue());

		generator.writeKey("chars_total");
		generator.write(this.charsTotal.doubleValue());

		generator.writeKey("source_max");
		generator.write(this.sourceMax.doubleValue());

		generator.writeKey("source_total");
		generator.write(this.sourceTotal.doubleValue());

		generator.writeKey("doc_max");
		generator.write(this.docMax.doubleValue());

		generator.writeKey("doc_total");
		generator.write(this.docTotal.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RuntimeFieldTypes}.
	 */
	public static class Builder implements ObjectBuilder<RuntimeFieldTypes> {
		private String name;

		private Number count;

		private Number indexCount;

		private Number scriptlessCount;

		private Number shadowedCount;

		private List<String> lang;

		private Number linesMax;

		private Number linesTotal;

		private Number charsMax;

		private Number charsTotal;

		private Number sourceMax;

		private Number sourceTotal;

		private Number docMax;

		private Number docTotal;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code index_count}
		 */
		public Builder indexCount(Number value) {
			this.indexCount = value;
			return this;
		}

		/**
		 * API name: {@code scriptless_count}
		 */
		public Builder scriptlessCount(Number value) {
			this.scriptlessCount = value;
			return this;
		}

		/**
		 * API name: {@code shadowed_count}
		 */
		public Builder shadowedCount(Number value) {
			this.shadowedCount = value;
			return this;
		}

		/**
		 * API name: {@code lang}
		 */
		public Builder lang(List<String> value) {
			this.lang = value;
			return this;
		}

		/**
		 * API name: {@code lang}
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
		 * API name: {@code lines_max}
		 */
		public Builder linesMax(Number value) {
			this.linesMax = value;
			return this;
		}

		/**
		 * API name: {@code lines_total}
		 */
		public Builder linesTotal(Number value) {
			this.linesTotal = value;
			return this;
		}

		/**
		 * API name: {@code chars_max}
		 */
		public Builder charsMax(Number value) {
			this.charsMax = value;
			return this;
		}

		/**
		 * API name: {@code chars_total}
		 */
		public Builder charsTotal(Number value) {
			this.charsTotal = value;
			return this;
		}

		/**
		 * API name: {@code source_max}
		 */
		public Builder sourceMax(Number value) {
			this.sourceMax = value;
			return this;
		}

		/**
		 * API name: {@code source_total}
		 */
		public Builder sourceTotal(Number value) {
			this.sourceTotal = value;
			return this;
		}

		/**
		 * API name: {@code doc_max}
		 */
		public Builder docMax(Number value) {
			this.docMax = value;
			return this;
		}

		/**
		 * API name: {@code doc_total}
		 */
		public Builder docTotal(Number value) {
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
	public static final JsonpDeserializer<RuntimeFieldTypes> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RuntimeFieldTypes::setupRuntimeFieldTypesDeserializer);

	protected static void setupRuntimeFieldTypesDeserializer(DelegatingDeserializer<RuntimeFieldTypes.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::indexCount, JsonpDeserializer.numberDeserializer(), "index_count");
		op.add(Builder::scriptlessCount, JsonpDeserializer.numberDeserializer(), "scriptless_count");
		op.add(Builder::shadowedCount, JsonpDeserializer.numberDeserializer(), "shadowed_count");
		op.add(Builder::lang, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "lang");
		op.add(Builder::linesMax, JsonpDeserializer.numberDeserializer(), "lines_max");
		op.add(Builder::linesTotal, JsonpDeserializer.numberDeserializer(), "lines_total");
		op.add(Builder::charsMax, JsonpDeserializer.numberDeserializer(), "chars_max");
		op.add(Builder::charsTotal, JsonpDeserializer.numberDeserializer(), "chars_total");
		op.add(Builder::sourceMax, JsonpDeserializer.numberDeserializer(), "source_max");
		op.add(Builder::sourceTotal, JsonpDeserializer.numberDeserializer(), "source_total");
		op.add(Builder::docMax, JsonpDeserializer.numberDeserializer(), "doc_max");
		op.add(Builder::docTotal, JsonpDeserializer.numberDeserializer(), "doc_total");

	}

}
