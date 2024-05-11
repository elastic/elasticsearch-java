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
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: xpack.usage.Base

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Base">API
 *      specification</a>
 */
@JsonpDeserializable
public class Base implements JsonpSerializable {
	private final boolean available;

	private final boolean enabled;

	// ---------------------------------------------------------------------------------------------

	protected Base(AbstractBuilder<?> builder) {

		this.available = ApiTypeHelper.requireNonNull(builder.available, this, "available");
		this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled");

	}

	public static Base baseOf(Function<Builder, ObjectBuilder<Base>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code available}
	 */
	public final boolean available() {
		return this.available;
	}

	/**
	 * Required - API name: {@code enabled}
	 */
	public final boolean enabled() {
		return this.enabled;
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

		generator.writeKey("available");
		generator.write(this.available);

		generator.writeKey("enabled");
		generator.write(this.enabled);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Base}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Base> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Base}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Base build() {
			_checkSingleUse();

			return new Base(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private Boolean available;

		private Boolean enabled;

		/**
		 * Required - API name: {@code available}
		 */
		public final BuilderT available(boolean value) {
			this.available = value;
			return self();
		}

		/**
		 * Required - API name: {@code enabled}
		 */
		public final BuilderT enabled(boolean value) {
			this.enabled = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Base}
	 */
	public static final JsonpDeserializer<Base> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Base::setupBaseDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::available, JsonpDeserializer.booleanDeserializer(), "available");
		op.add(AbstractBuilder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");

	}

}
