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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterOperatingSystem
@JsonpDeserializable
public final class ClusterOperatingSystem implements JsonpSerializable {
	private final int allocatedProcessors;

	private final int availableProcessors;

	private final OperatingSystemMemoryInfo mem;

	private final List<ClusterOperatingSystemName> names;

	private final List<ClusterOperatingSystemPrettyName> prettyNames;

	@Nullable
	private final List<ClusterOperatingSystemArchitecture> architectures;

	// ---------------------------------------------------------------------------------------------

	public ClusterOperatingSystem(Builder builder) {

		this.allocatedProcessors = Objects.requireNonNull(builder.allocatedProcessors, "allocated_processors");
		this.availableProcessors = Objects.requireNonNull(builder.availableProcessors, "available_processors");
		this.mem = Objects.requireNonNull(builder.mem, "mem");
		this.names = ModelTypeHelper.unmodifiableNonNull(builder.names, "names");
		this.prettyNames = ModelTypeHelper.unmodifiableNonNull(builder.prettyNames, "pretty_names");
		this.architectures = ModelTypeHelper.unmodifiable(builder.architectures);

	}

	public ClusterOperatingSystem(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code allocated_processors}
	 */
	public int allocatedProcessors() {
		return this.allocatedProcessors;
	}

	/**
	 * Required - API name: {@code available_processors}
	 */
	public int availableProcessors() {
		return this.availableProcessors;
	}

	/**
	 * Required - API name: {@code mem}
	 */
	public OperatingSystemMemoryInfo mem() {
		return this.mem;
	}

	/**
	 * Required - API name: {@code names}
	 */
	public List<ClusterOperatingSystemName> names() {
		return this.names;
	}

	/**
	 * Required - API name: {@code pretty_names}
	 */
	public List<ClusterOperatingSystemPrettyName> prettyNames() {
		return this.prettyNames;
	}

	/**
	 * API name: {@code architectures}
	 */
	@Nullable
	public List<ClusterOperatingSystemArchitecture> architectures() {
		return this.architectures;
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

		generator.writeKey("allocated_processors");
		generator.write(this.allocatedProcessors);

		generator.writeKey("available_processors");
		generator.write(this.availableProcessors);

		generator.writeKey("mem");
		this.mem.serialize(generator, mapper);

		generator.writeKey("names");
		generator.writeStartArray();
		for (ClusterOperatingSystemName item0 : this.names) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("pretty_names");
		generator.writeStartArray();
		for (ClusterOperatingSystemPrettyName item0 : this.prettyNames) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.architectures != null) {

			generator.writeKey("architectures");
			generator.writeStartArray();
			for (ClusterOperatingSystemArchitecture item0 : this.architectures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterOperatingSystem}.
	 */
	public static class Builder implements ObjectBuilder<ClusterOperatingSystem> {
		private Integer allocatedProcessors;

		private Integer availableProcessors;

		private OperatingSystemMemoryInfo mem;

		private List<ClusterOperatingSystemName> names;

		private List<ClusterOperatingSystemPrettyName> prettyNames;

		@Nullable
		private List<ClusterOperatingSystemArchitecture> architectures;

		/**
		 * Required - API name: {@code allocated_processors}
		 */
		public Builder allocatedProcessors(int value) {
			this.allocatedProcessors = value;
			return this;
		}

		/**
		 * Required - API name: {@code available_processors}
		 */
		public Builder availableProcessors(int value) {
			this.availableProcessors = value;
			return this;
		}

		/**
		 * Required - API name: {@code mem}
		 */
		public Builder mem(OperatingSystemMemoryInfo value) {
			this.mem = value;
			return this;
		}

		/**
		 * Required - API name: {@code mem}
		 */
		public Builder mem(Function<OperatingSystemMemoryInfo.Builder, ObjectBuilder<OperatingSystemMemoryInfo>> fn) {
			return this.mem(fn.apply(new OperatingSystemMemoryInfo.Builder()).build());
		}

		/**
		 * Required - API name: {@code names}
		 */
		public Builder names(List<ClusterOperatingSystemName> value) {
			this.names = value;
			return this;
		}

		/**
		 * Required - API name: {@code names}
		 */
		public Builder names(ClusterOperatingSystemName... value) {
			this.names = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #names(List)}, creating the list if needed.
		 */
		public Builder addNames(ClusterOperatingSystemName value) {
			if (this.names == null) {
				this.names = new ArrayList<>();
			}
			this.names.add(value);
			return this;
		}

		/**
		 * Set {@link #names(List)} to a singleton list.
		 */
		public Builder names(
				Function<ClusterOperatingSystemName.Builder, ObjectBuilder<ClusterOperatingSystemName>> fn) {
			return this.names(fn.apply(new ClusterOperatingSystemName.Builder()).build());
		}

		/**
		 * Add a value to {@link #names(List)}, creating the list if needed.
		 */
		public Builder addNames(
				Function<ClusterOperatingSystemName.Builder, ObjectBuilder<ClusterOperatingSystemName>> fn) {
			return this.addNames(fn.apply(new ClusterOperatingSystemName.Builder()).build());
		}

		/**
		 * Required - API name: {@code pretty_names}
		 */
		public Builder prettyNames(List<ClusterOperatingSystemPrettyName> value) {
			this.prettyNames = value;
			return this;
		}

		/**
		 * Required - API name: {@code pretty_names}
		 */
		public Builder prettyNames(ClusterOperatingSystemPrettyName... value) {
			this.prettyNames = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #prettyNames(List)}, creating the list if needed.
		 */
		public Builder addPrettyNames(ClusterOperatingSystemPrettyName value) {
			if (this.prettyNames == null) {
				this.prettyNames = new ArrayList<>();
			}
			this.prettyNames.add(value);
			return this;
		}

		/**
		 * Set {@link #prettyNames(List)} to a singleton list.
		 */
		public Builder prettyNames(
				Function<ClusterOperatingSystemPrettyName.Builder, ObjectBuilder<ClusterOperatingSystemPrettyName>> fn) {
			return this.prettyNames(fn.apply(new ClusterOperatingSystemPrettyName.Builder()).build());
		}

		/**
		 * Add a value to {@link #prettyNames(List)}, creating the list if needed.
		 */
		public Builder addPrettyNames(
				Function<ClusterOperatingSystemPrettyName.Builder, ObjectBuilder<ClusterOperatingSystemPrettyName>> fn) {
			return this.addPrettyNames(fn.apply(new ClusterOperatingSystemPrettyName.Builder()).build());
		}

		/**
		 * API name: {@code architectures}
		 */
		public Builder architectures(@Nullable List<ClusterOperatingSystemArchitecture> value) {
			this.architectures = value;
			return this;
		}

		/**
		 * API name: {@code architectures}
		 */
		public Builder architectures(ClusterOperatingSystemArchitecture... value) {
			this.architectures = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #architectures(List)}, creating the list if needed.
		 */
		public Builder addArchitectures(ClusterOperatingSystemArchitecture value) {
			if (this.architectures == null) {
				this.architectures = new ArrayList<>();
			}
			this.architectures.add(value);
			return this;
		}

		/**
		 * Set {@link #architectures(List)} to a singleton list.
		 */
		public Builder architectures(
				Function<ClusterOperatingSystemArchitecture.Builder, ObjectBuilder<ClusterOperatingSystemArchitecture>> fn) {
			return this.architectures(fn.apply(new ClusterOperatingSystemArchitecture.Builder()).build());
		}

		/**
		 * Add a value to {@link #architectures(List)}, creating the list if needed.
		 */
		public Builder addArchitectures(
				Function<ClusterOperatingSystemArchitecture.Builder, ObjectBuilder<ClusterOperatingSystemArchitecture>> fn) {
			return this.addArchitectures(fn.apply(new ClusterOperatingSystemArchitecture.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterOperatingSystem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterOperatingSystem build() {

			return new ClusterOperatingSystem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterOperatingSystem}
	 */
	public static final JsonpDeserializer<ClusterOperatingSystem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterOperatingSystem::setupClusterOperatingSystemDeserializer, Builder::build);

	protected static void setupClusterOperatingSystemDeserializer(
			DelegatingDeserializer<ClusterOperatingSystem.Builder> op) {

		op.add(Builder::allocatedProcessors, JsonpDeserializer.integerDeserializer(), "allocated_processors");
		op.add(Builder::availableProcessors, JsonpDeserializer.integerDeserializer(), "available_processors");
		op.add(Builder::mem, OperatingSystemMemoryInfo._DESERIALIZER, "mem");
		op.add(Builder::names, JsonpDeserializer.arrayDeserializer(ClusterOperatingSystemName._DESERIALIZER), "names");
		op.add(Builder::prettyNames,
				JsonpDeserializer.arrayDeserializer(ClusterOperatingSystemPrettyName._DESERIALIZER), "pretty_names");
		op.add(Builder::architectures,
				JsonpDeserializer.arrayDeserializer(ClusterOperatingSystemArchitecture._DESERIALIZER), "architectures");

	}

}
