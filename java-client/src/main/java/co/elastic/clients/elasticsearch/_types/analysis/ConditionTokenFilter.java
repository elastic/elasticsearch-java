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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.analysis.ConditionTokenFilter
@JsonpDeserializable
public final class ConditionTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final List<String> filter;

	private final JsonValue /* _types.Script */ script;

	// ---------------------------------------------------------------------------------------------

	public ConditionTokenFilter(Builder builder) {
		super(builder);

		this.filter = Objects.requireNonNull(builder.filter, "filter");
		this.script = Objects.requireNonNull(builder.script, "script");

	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "condition";
	}

	/**
	 * API name: {@code filter}
	 */
	public List<String> filter() {
		return this.filter;
	}

	/**
	 * API name: {@code script}
	 */
	public JsonValue /* _types.Script */ script() {
		return this.script;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "condition");
		super.serializeInternal(generator, mapper);

		generator.writeKey("filter");
		generator.writeStartArray();
		for (String item0 : this.filter) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("script");
		generator.write(this.script);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ConditionTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ConditionTokenFilter> {
		private List<String> filter;

		private JsonValue /* _types.Script */ script;

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(List<String> value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(String... value) {
			this.filter = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #filter(List)}, creating the list if needed.
		 */
		public Builder addFilter(String value) {
			if (this.filter == null) {
				this.filter = new ArrayList<>();
			}
			this.filter.add(value);
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ConditionTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ConditionTokenFilter build() {

			return new ConditionTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ConditionTokenFilter}
	 */
	public static final JsonpDeserializer<ConditionTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ConditionTokenFilter::setupConditionTokenFilterDeserializer, Builder::build);

	protected static void setupConditionTokenFilterDeserializer(
			DelegatingDeserializer<ConditionTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "filter");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");

		op.ignore("type");
	}

}
