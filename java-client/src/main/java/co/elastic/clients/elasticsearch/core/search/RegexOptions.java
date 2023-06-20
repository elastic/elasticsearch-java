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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.RegexOptions

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.RegexOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class RegexOptions implements JsonpSerializable {
	@Nullable
	private final String flags;

	@Nullable
	private final Integer maxDeterminizedStates;

	// ---------------------------------------------------------------------------------------------

	private RegexOptions(Builder builder) {

		this.flags = builder.flags;
		this.maxDeterminizedStates = builder.maxDeterminizedStates;

	}

	public static RegexOptions of(Function<Builder, ObjectBuilder<RegexOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code flags}
	 */
	@Nullable
	public final String flags() {
		return this.flags;
	}

	/**
	 * API name: {@code max_determinized_states}
	 */
	@Nullable
	public final Integer maxDeterminizedStates() {
		return this.maxDeterminizedStates;
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

		if (this.flags != null) {
			generator.writeKey("flags");
			generator.write(this.flags);

		}
		if (this.maxDeterminizedStates != null) {
			generator.writeKey("max_determinized_states");
			generator.write(this.maxDeterminizedStates);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RegexOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RegexOptions> {
		@Nullable
		private String flags;

		@Nullable
		private Integer maxDeterminizedStates;

		/**
		 * API name: {@code flags}
		 */
		public final Builder flags(@Nullable String value) {
			this.flags = value;
			return this;
		}

		/**
		 * API name: {@code max_determinized_states}
		 */
		public final Builder maxDeterminizedStates(@Nullable Integer value) {
			this.maxDeterminizedStates = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RegexOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RegexOptions build() {
			_checkSingleUse();

			return new RegexOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RegexOptions}
	 */
	public static final JsonpDeserializer<RegexOptions> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RegexOptions::setupRegexOptionsDeserializer);

	protected static void setupRegexOptionsDeserializer(ObjectDeserializer<RegexOptions.Builder> op) {

		op.add(Builder::flags, JsonpDeserializer.stringDeserializer(), "flags");
		op.add(Builder::maxDeterminizedStates, JsonpDeserializer.integerDeserializer(), "max_determinized_states");

	}

}
