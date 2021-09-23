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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.Collector
public final class Collector implements JsonpSerializable {
	private final String name;

	private final String reason;

	private final Number timeInNanos;

	@Nullable
	private final List<co.elastic.clients.elasticsearch._core.search.Collector> children;

	// ---------------------------------------------------------------------------------------------

	public Collector(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.reason = Objects.requireNonNull(builder.reason, "reason");
		this.timeInNanos = Objects.requireNonNull(builder.timeInNanos, "time_in_nanos");
		this.children = builder.children;

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code reason}
	 */
	public String reason() {
		return this.reason;
	}

	/**
	 * API name: {@code time_in_nanos}
	 */
	public Number timeInNanos() {
		return this.timeInNanos;
	}

	/**
	 * API name: {@code children}
	 */
	@Nullable
	public List<co.elastic.clients.elasticsearch._core.search.Collector> children() {
		return this.children;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("reason");
		generator.write(this.reason);

		generator.writeKey("time_in_nanos");
		generator.write(this.timeInNanos.doubleValue());

		if (this.children != null) {

			generator.writeKey("children");
			generator.writeStartArray();
			for (co.elastic.clients.elasticsearch._core.search.Collector item0 : this.children) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Collector}.
	 */
	public static class Builder implements ObjectBuilder<Collector> {
		private String name;

		private String reason;

		private Number timeInNanos;

		@Nullable
		private List<co.elastic.clients.elasticsearch._core.search.Collector> children;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code time_in_nanos}
		 */
		public Builder timeInNanos(Number value) {
			this.timeInNanos = value;
			return this;
		}

		/**
		 * API name: {@code children}
		 */
		public Builder children(@Nullable List<co.elastic.clients.elasticsearch._core.search.Collector> value) {
			this.children = value;
			return this;
		}

		/**
		 * API name: {@code children}
		 */
		public Builder children(co.elastic.clients.elasticsearch._core.search.Collector... value) {
			this.children = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #children(List)}, creating the list if needed.
		 */
		public Builder addChildren(co.elastic.clients.elasticsearch._core.search.Collector value) {
			if (this.children == null) {
				this.children = new ArrayList<>();
			}
			this.children.add(value);
			return this;
		}

		/**
		 * Set {@link #children(List)} to a singleton list.
		 */
		public Builder children(
				Function<co.elastic.clients.elasticsearch._core.search.Collector.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._core.search.Collector>> fn) {
			return this
					.children(fn.apply(new co.elastic.clients.elasticsearch._core.search.Collector.Builder()).build());
		}

		/**
		 * Add a value to {@link #children(List)}, creating the list if needed.
		 */
		public Builder addChildren(
				Function<co.elastic.clients.elasticsearch._core.search.Collector.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._core.search.Collector>> fn) {
			return this.addChildren(
					fn.apply(new co.elastic.clients.elasticsearch._core.search.Collector.Builder()).build());
		}

		/**
		 * Builds a {@link Collector}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Collector build() {

			return new Collector(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Collector}
	 */
	public static final JsonpDeserializer<Collector> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Collector::setupCollectorDeserializer);

	protected static void setupCollectorDeserializer(DelegatingDeserializer<Collector.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::timeInNanos, JsonpDeserializer.numberDeserializer(), "time_in_nanos");
		op.add(Builder::children, JsonpDeserializer
				.arrayDeserializer(co.elastic.clients.elasticsearch._core.search.Collector.DESERIALIZER), "children");

	}

}
