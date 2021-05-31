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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.IngestTotal
public final class IngestTotal implements ToJsonp {
	private final Number count;

	private final Number current;

	private final Number failed;

	private final List<KeyedProcessor> processors;

	private final Number timeInMillis;

	// ---------------------------------------------------------------------------------------------

	protected IngestTotal(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.current = Objects.requireNonNull(builder.current, "current");
		this.failed = Objects.requireNonNull(builder.failed, "failed");
		this.processors = Objects.requireNonNull(builder.processors, "processors");
		this.timeInMillis = Objects.requireNonNull(builder.timeInMillis, "time_in_millis");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code current}
	 */
	public Number current() {
		return this.current;
	}

	/**
	 * API name: {@code failed}
	 */
	public Number failed() {
		return this.failed;
	}

	/**
	 * API name: {@code processors}
	 */
	public List<KeyedProcessor> processors() {
		return this.processors;
	}

	/**
	 * API name: {@code time_in_millis}
	 */
	public Number timeInMillis() {
		return this.timeInMillis;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("current");
		generator.write(this.current.doubleValue());

		generator.writeKey("failed");
		generator.write(this.failed.doubleValue());

		generator.writeKey("processors");
		generator.writeStartArray();
		for (KeyedProcessor item0 : this.processors) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("time_in_millis");
		generator.write(this.timeInMillis.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IngestTotal}.
	 */
	public static class Builder implements ObjectBuilder<IngestTotal> {
		private Number count;

		private Number current;

		private Number failed;

		private List<KeyedProcessor> processors;

		private Number timeInMillis;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code current}
		 */
		public Builder current(Number value) {
			this.current = value;
			return this;
		}

		/**
		 * API name: {@code failed}
		 */
		public Builder failed(Number value) {
			this.failed = value;
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		public Builder processors(List<KeyedProcessor> value) {
			this.processors = value;
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		public Builder processors(KeyedProcessor... value) {
			this.processors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #processors(List)}, creating the list if needed.
		 */
		public Builder addProcessors(KeyedProcessor value) {
			if (this.processors == null) {
				this.processors = new ArrayList<>();
			}
			this.processors.add(value);
			return this;
		}

		/**
		 * Set {@link #processors(List)} to a singleton list.
		 */
		public Builder processors(Function<KeyedProcessor.Builder, ObjectBuilder<KeyedProcessor>> fn) {
			return this.processors(fn.apply(new KeyedProcessor.Builder()).build());
		}

		/**
		 * Add a value to {@link #processors(List)}, creating the list if needed.
		 */
		public Builder addProcessors(Function<KeyedProcessor.Builder, ObjectBuilder<KeyedProcessor>> fn) {
			return this.addProcessors(fn.apply(new KeyedProcessor.Builder()).build());
		}

		/**
		 * API name: {@code time_in_millis}
		 */
		public Builder timeInMillis(Number value) {
			this.timeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link IngestTotal}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IngestTotal build() {

			return new IngestTotal(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for IngestTotal
	 */
	public static final JsonpValueParser<IngestTotal> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, IngestTotal::setupIngestTotalParser);

	protected static void setupIngestTotalParser(DelegatingJsonpValueParser<IngestTotal.Builder> op) {

		op.add(Builder::count, JsonpValueParser.numberParser(), "count");
		op.add(Builder::current, JsonpValueParser.numberParser(), "current");
		op.add(Builder::failed, JsonpValueParser.numberParser(), "failed");
		op.add(Builder::processors, JsonpValueParser.arrayParser(KeyedProcessor.JSONP_PARSER), "processors");
		op.add(Builder::timeInMillis, JsonpValueParser.numberParser(), "time_in_millis");

	}

}
