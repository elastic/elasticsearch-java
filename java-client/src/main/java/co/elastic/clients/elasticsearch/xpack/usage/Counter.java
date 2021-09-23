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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.Counter
public class Counter implements JsonpSerializable {
	private final Number active;

	private final Number total;

	// ---------------------------------------------------------------------------------------------

	public Counter(AbstractBuilder<?> builder) {

		this.active = Objects.requireNonNull(builder.active, "active");
		this.total = Objects.requireNonNull(builder.total, "total");

	}

	/**
	 * API name: {@code active}
	 */
	public Number active() {
		return this.active;
	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
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

		generator.writeKey("active");
		generator.write(this.active.doubleValue());

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Counter}.
	 */
	public static class Builder extends Counter.AbstractBuilder<Builder> implements ObjectBuilder<Counter> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Counter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Counter build() {

			return new Counter(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		private Number active;

		private Number total;

		/**
		 * API name: {@code active}
		 */
		public BuilderT active(Number value) {
			this.active = value;
			return self();
		}

		/**
		 * API name: {@code total}
		 */
		public BuilderT total(Number value) {
			this.total = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Counter}
	 */
	public static final JsonpDeserializer<Counter> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Counter::setupCounterDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupCounterDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::active, JsonpDeserializer.numberDeserializer(), "active");
		op.add(AbstractBuilder::total, JsonpDeserializer.numberDeserializer(), "total");

	}

}
