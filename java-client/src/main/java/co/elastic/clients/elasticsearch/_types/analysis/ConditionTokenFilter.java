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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.ConditionTokenFilter
@JsonpDeserializable
public class ConditionTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final List<String> filter;

	private final JsonValue /* _types.Script */ script;

	// ---------------------------------------------------------------------------------------------

	private ConditionTokenFilter(Builder builder) {
		super(builder);

		this.filter = ModelTypeHelper.unmodifiableRequired(builder.filter, this, "filter");
		this.script = ModelTypeHelper.requireNonNull(builder.script, this, "script");

	}

	public static ConditionTokenFilter of(Function<Builder, ObjectBuilder<ConditionTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "condition";
	}

	/**
	 * Required - API name: {@code filter}
	 */
	public final List<String> filter() {
		return this.filter;
	}

	/**
	 * Required - API name: {@code script}
	 */
	public final JsonValue /* _types.Script */ script() {
		return this.script;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "condition");
		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.filter)) {
			generator.writeKey("filter");
			generator.writeStartArray();
			for (String item0 : this.filter) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
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
		 * Required - API name: {@code filter}
		 */
		public final Builder filter(List<String> value) {
			this.filter = value;
			return this;
		}

		/**
		 * Required - API name: {@code filter}
		 */
		public final Builder filter(String... value) {
			this.filter = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code script}
		 */
		public final Builder script(JsonValue /* _types.Script */ value) {
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
			_checkSingleUse();

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
