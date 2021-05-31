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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.Counter
public class Counter implements ToJsonp {
	private final Number active;

	private final Number total;

	// ---------------------------------------------------------------------------------------------

	protected Counter(AbstractBuilder<?> builder) {

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
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

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
	 * Json parser for Counter
	 */
	public static final JsonpValueParser<Counter> JSONP_PARSER = JsonpObjectBuilderParser.createForObject(Builder::new,
			Counter::setupCounterParser);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupCounterParser(
			DelegatingJsonpValueParser<BuilderT> op) {

		op.add(AbstractBuilder::active, JsonpValueParser.numberParser(), "active");
		op.add(AbstractBuilder::total, JsonpValueParser.numberParser(), "total");

	}

}
