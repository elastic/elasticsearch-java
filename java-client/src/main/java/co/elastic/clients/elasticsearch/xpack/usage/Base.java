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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: xpack.usage.Base
@JsonpDeserializable
public class Base implements JsonpSerializable {
	private final boolean available;

	private final boolean enabled;

	// ---------------------------------------------------------------------------------------------

	protected Base(AbstractBuilder<?> builder) {

		this.available = ModelTypeHelper.requireNonNull(builder.available, this, "available");
		this.enabled = ModelTypeHelper.requireNonNull(builder.enabled, this, "enabled");

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

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ObjectBuilderBase {
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
			Base::setupBaseDeserializer, Builder::build);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::available, JsonpDeserializer.booleanDeserializer(), "available");
		op.add(AbstractBuilder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");

	}

}
