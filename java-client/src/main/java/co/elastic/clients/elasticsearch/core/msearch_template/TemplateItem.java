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

package co.elastic.clients.elasticsearch.core.msearch_template;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
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
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.msearch_template.TemplateItem
@JsonpDeserializable
public class TemplateItem implements JsonpSerializable {
	@Nullable
	private final String id;

	private final List<String> index;

	private final Map<String, JsonData> params;

	@Nullable
	private final String source;

	// ---------------------------------------------------------------------------------------------

	private TemplateItem(Builder builder) {

		this.id = builder.id;
		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.params = ModelTypeHelper.unmodifiable(builder.params);
		this.source = builder.source;

	}

	public static TemplateItem of(Function<Builder, ObjectBuilder<TemplateItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
	}

	/**
	 * API name: {@code source}
	 */
	@Nullable
	public final String source() {
		return this.source;
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

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (ModelTypeHelper.isDefined(this.index)) {
			generator.writeKey("index");
			generator.writeStartArray();
			for (String item0 : this.index) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.source != null) {
			generator.writeKey("source");
			generator.write(this.source);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TemplateItem}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TemplateItem> {
		@Nullable
		private String id;

		@Nullable
		private List<String> index;

		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private String source;

		/**
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code params}
		 */
		public final Builder params(@Nullable Map<String, JsonData> value) {
			this.params = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public final Builder source(@Nullable String value) {
			this.source = value;
			return this;
		}

		/**
		 * Builds a {@link TemplateItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TemplateItem build() {
			_checkSingleUse();

			return new TemplateItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TemplateItem}
	 */
	public static final JsonpDeserializer<TemplateItem> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TemplateItem::setupTemplateItemDeserializer, Builder::build);

	protected static void setupTemplateItemDeserializer(DelegatingDeserializer<TemplateItem.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::index, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "index");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");

	}

}
