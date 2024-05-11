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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.Long;
import java.lang.String;
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

// typedef: xpack.usage.RuntimeFieldsType

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.RuntimeFieldsType">API
 *      specification</a>
 */
@JsonpDeserializable
public class RuntimeFieldsType implements JsonpSerializable {
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

	private RuntimeFieldsType(Builder builder) {

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

	public static RuntimeFieldsType of(Function<Builder, ObjectBuilder<RuntimeFieldsType>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code chars_max}
	 */
	public final long charsMax() {
		return this.charsMax;
	}

	/**
	 * Required - API name: {@code chars_total}
	 */
	public final long charsTotal() {
		return this.charsTotal;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code doc_max}
	 */
	public final long docMax() {
		return this.docMax;
	}

	/**
	 * Required - API name: {@code doc_total}
	 */
	public final long docTotal() {
		return this.docTotal;
	}

	/**
	 * Required - API name: {@code index_count}
	 */
	public final long indexCount() {
		return this.indexCount;
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
	public final long linesMax() {
		return this.linesMax;
	}

	/**
	 * Required - API name: {@code lines_total}
	 */
	public final long linesTotal() {
		return this.linesTotal;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code scriptless_count}
	 */
	public final long scriptlessCount() {
		return this.scriptlessCount;
	}

	/**
	 * Required - API name: {@code shadowed_count}
	 */
	public final long shadowedCount() {
		return this.shadowedCount;
	}

	/**
	 * Required - API name: {@code source_max}
	 */
	public final long sourceMax() {
		return this.sourceMax;
	}

	/**
	 * Required - API name: {@code source_total}
	 */
	public final long sourceTotal() {
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
	 * Builder for {@link RuntimeFieldsType}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RuntimeFieldsType> {
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
		public final Builder charsMax(long value) {
			this.charsMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code chars_total}
		 */
		public final Builder charsTotal(long value) {
			this.charsTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code doc_max}
		 */
		public final Builder docMax(long value) {
			this.docMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code doc_total}
		 */
		public final Builder docTotal(long value) {
			this.docTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_count}
		 */
		public final Builder indexCount(long value) {
			this.indexCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code lang}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>lang</code>.
		 */
		public final Builder lang(List<String> list) {
			this.lang = _listAddAll(this.lang, list);
			return this;
		}

		/**
		 * Required - API name: {@code lang}
		 * <p>
		 * Adds one or more values to <code>lang</code>.
		 */
		public final Builder lang(String value, String... values) {
			this.lang = _listAdd(this.lang, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code lines_max}
		 */
		public final Builder linesMax(long value) {
			this.linesMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code lines_total}
		 */
		public final Builder linesTotal(long value) {
			this.linesTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code scriptless_count}
		 */
		public final Builder scriptlessCount(long value) {
			this.scriptlessCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code shadowed_count}
		 */
		public final Builder shadowedCount(long value) {
			this.shadowedCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code source_max}
		 */
		public final Builder sourceMax(long value) {
			this.sourceMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code source_total}
		 */
		public final Builder sourceTotal(long value) {
			this.sourceTotal = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RuntimeFieldsType}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RuntimeFieldsType build() {
			_checkSingleUse();

			return new RuntimeFieldsType(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RuntimeFieldsType}
	 */
	public static final JsonpDeserializer<RuntimeFieldsType> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RuntimeFieldsType::setupRuntimeFieldsTypeDeserializer);

	protected static void setupRuntimeFieldsTypeDeserializer(ObjectDeserializer<RuntimeFieldsType.Builder> op) {

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
