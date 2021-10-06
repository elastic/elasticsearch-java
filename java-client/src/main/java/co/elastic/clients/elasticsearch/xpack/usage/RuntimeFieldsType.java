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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.RuntimeFieldsType
@JsonpDeserializable
public final class RuntimeFieldsType implements JsonpSerializable {
	private final long charsMax;

	private final long charsTotal;

	private final long count;

	private final long docMax;

	private final long docTotal;

	private final long indexCount;

	private final List<String> lang;

	private final long linesMax;

	private final long linesTotal;

	private final String name;

	private final long scriptlessCount;

	private final long shadowedCount;

	private final long sourceMax;

	private final long sourceTotal;

	// ---------------------------------------------------------------------------------------------

	public RuntimeFieldsType(Builder builder) {

		this.charsMax = Objects.requireNonNull(builder.charsMax, "chars_max");
		this.charsTotal = Objects.requireNonNull(builder.charsTotal, "chars_total");
		this.count = Objects.requireNonNull(builder.count, "count");
		this.docMax = Objects.requireNonNull(builder.docMax, "doc_max");
		this.docTotal = Objects.requireNonNull(builder.docTotal, "doc_total");
		this.indexCount = Objects.requireNonNull(builder.indexCount, "index_count");
		this.lang = ModelTypeHelper.unmodifiableNonNull(builder.lang, "lang");
		this.linesMax = Objects.requireNonNull(builder.linesMax, "lines_max");
		this.linesTotal = Objects.requireNonNull(builder.linesTotal, "lines_total");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.scriptlessCount = Objects.requireNonNull(builder.scriptlessCount, "scriptless_count");
		this.shadowedCount = Objects.requireNonNull(builder.shadowedCount, "shadowed_count");
		this.sourceMax = Objects.requireNonNull(builder.sourceMax, "source_max");
		this.sourceTotal = Objects.requireNonNull(builder.sourceTotal, "source_total");

	}

	public RuntimeFieldsType(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code chars_max}
	 */
	public long charsMax() {
		return this.charsMax;
	}

	/**
	 * Required - API name: {@code chars_total}
	 */
	public long charsTotal() {
		return this.charsTotal;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code doc_max}
	 */
	public long docMax() {
		return this.docMax;
	}

	/**
	 * Required - API name: {@code doc_total}
	 */
	public long docTotal() {
		return this.docTotal;
	}

	/**
	 * Required - API name: {@code index_count}
	 */
	public long indexCount() {
		return this.indexCount;
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
	public long linesMax() {
		return this.linesMax;
	}

	/**
	 * Required - API name: {@code lines_total}
	 */
	public long linesTotal() {
		return this.linesTotal;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code scriptless_count}
	 */
	public long scriptlessCount() {
		return this.scriptlessCount;
	}

	/**
	 * Required - API name: {@code shadowed_count}
	 */
	public long shadowedCount() {
		return this.shadowedCount;
	}

	/**
	 * Required - API name: {@code source_max}
	 */
	public long sourceMax() {
		return this.sourceMax;
	}

	/**
	 * Required - API name: {@code source_total}
	 */
	public long sourceTotal() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RuntimeFieldsType}.
	 */
	public static class Builder implements ObjectBuilder<RuntimeFieldsType> {
		private Long charsMax;

		private Long charsTotal;

		private Long count;

		private Long docMax;

		private Long docTotal;

		private Long indexCount;

		private List<String> lang;

		private Long linesMax;

		private Long linesTotal;

		private String name;

		private Long scriptlessCount;

		private Long shadowedCount;

		private Long sourceMax;

		private Long sourceTotal;

		/**
		 * Required - API name: {@code chars_max}
		 */
		public Builder charsMax(long value) {
			this.charsMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code chars_total}
		 */
		public Builder charsTotal(long value) {
			this.charsTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code doc_max}
		 */
		public Builder docMax(long value) {
			this.docMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code doc_total}
		 */
		public Builder docTotal(long value) {
			this.docTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_count}
		 */
		public Builder indexCount(long value) {
			this.indexCount = value;
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
		public Builder linesMax(long value) {
			this.linesMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code lines_total}
		 */
		public Builder linesTotal(long value) {
			this.linesTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code scriptless_count}
		 */
		public Builder scriptlessCount(long value) {
			this.scriptlessCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code shadowed_count}
		 */
		public Builder shadowedCount(long value) {
			this.shadowedCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code source_max}
		 */
		public Builder sourceMax(long value) {
			this.sourceMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code source_total}
		 */
		public Builder sourceTotal(long value) {
			this.sourceTotal = value;
			return this;
		}

		/**
		 * Builds a {@link RuntimeFieldsType}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RuntimeFieldsType build() {

			return new RuntimeFieldsType(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RuntimeFieldsType}
	 */
	public static final JsonpDeserializer<RuntimeFieldsType> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RuntimeFieldsType::setupRuntimeFieldsTypeDeserializer, Builder::build);

	protected static void setupRuntimeFieldsTypeDeserializer(DelegatingDeserializer<RuntimeFieldsType.Builder> op) {

		op.add(Builder::charsMax, JsonpDeserializer.longDeserializer(), "chars_max");
		op.add(Builder::charsTotal, JsonpDeserializer.longDeserializer(), "chars_total");
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::docMax, JsonpDeserializer.longDeserializer(), "doc_max");
		op.add(Builder::docTotal, JsonpDeserializer.longDeserializer(), "doc_total");
		op.add(Builder::indexCount, JsonpDeserializer.longDeserializer(), "index_count");
		op.add(Builder::lang, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "lang");
		op.add(Builder::linesMax, JsonpDeserializer.longDeserializer(), "lines_max");
		op.add(Builder::linesTotal, JsonpDeserializer.longDeserializer(), "lines_total");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::scriptlessCount, JsonpDeserializer.longDeserializer(), "scriptless_count");
		op.add(Builder::shadowedCount, JsonpDeserializer.longDeserializer(), "shadowed_count");
		op.add(Builder::sourceMax, JsonpDeserializer.longDeserializer(), "source_max");
		op.add(Builder::sourceTotal, JsonpDeserializer.longDeserializer(), "source_total");

	}

}
