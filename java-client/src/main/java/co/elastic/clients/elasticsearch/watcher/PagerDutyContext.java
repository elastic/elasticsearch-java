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

package co.elastic.clients.elasticsearch.watcher;

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
import java.lang.String;
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

// typedef: watcher._types.PagerDutyContext

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.PagerDutyContext">API
 *      specification</a>
 */
@JsonpDeserializable
public class PagerDutyContext implements JsonpSerializable {
	@Nullable
	private final String href;

	@Nullable
	private final String src;

	private final PagerDutyContextType type;

	// ---------------------------------------------------------------------------------------------

	private PagerDutyContext(Builder builder) {

		this.href = builder.href;
		this.src = builder.src;
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static PagerDutyContext of(Function<Builder, ObjectBuilder<PagerDutyContext>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code href}
	 */
	@Nullable
	public final String href() {
		return this.href;
	}

	/**
	 * API name: {@code src}
	 */
	@Nullable
	public final String src() {
		return this.src;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final PagerDutyContextType type() {
		return this.type;
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

		if (this.href != null) {
			generator.writeKey("href");
			generator.write(this.href);

		}
		if (this.src != null) {
			generator.writeKey("src");
			generator.write(this.src);

		}
		generator.writeKey("type");
		this.type.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PagerDutyContext}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PagerDutyContext> {
		@Nullable
		private String href;

		@Nullable
		private String src;

		private PagerDutyContextType type;

		/**
		 * API name: {@code href}
		 */
		public final Builder href(@Nullable String value) {
			this.href = value;
			return this;
		}

		/**
		 * API name: {@code src}
		 */
		public final Builder src(@Nullable String value) {
			this.src = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(PagerDutyContextType value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PagerDutyContext}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PagerDutyContext build() {
			_checkSingleUse();

			return new PagerDutyContext(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PagerDutyContext}
	 */
	public static final JsonpDeserializer<PagerDutyContext> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PagerDutyContext::setupPagerDutyContextDeserializer);

	protected static void setupPagerDutyContextDeserializer(ObjectDeserializer<PagerDutyContext.Builder> op) {

		op.add(Builder::href, JsonpDeserializer.stringDeserializer(), "href");
		op.add(Builder::src, JsonpDeserializer.stringDeserializer(), "src");
		op.add(Builder::type, PagerDutyContextType._DESERIALIZER, "type");

	}

}
