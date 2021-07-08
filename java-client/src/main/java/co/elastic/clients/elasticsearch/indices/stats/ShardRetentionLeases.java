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

package co.elastic.clients.elasticsearch.indices.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
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

// typedef: indices.stats.ShardRetentionLeases
public final class ShardRetentionLeases implements ToJsonp {
	private final Number primaryTerm;

	private final Number version;

	private final List<ShardLease> leases;

	// ---------------------------------------------------------------------------------------------

	protected ShardRetentionLeases(Builder builder) {

		this.primaryTerm = Objects.requireNonNull(builder.primaryTerm, "primary_term");
		this.version = Objects.requireNonNull(builder.version, "version");
		this.leases = Objects.requireNonNull(builder.leases, "leases");

	}

	/**
	 * API name: {@code primary_term}
	 */
	public Number primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * API name: {@code version}
	 */
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code leases}
	 */
	public List<ShardLease> leases() {
		return this.leases;
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

		generator.writeKey("primary_term");
		generator.write(this.primaryTerm.doubleValue());

		generator.writeKey("version");
		generator.write(this.version.doubleValue());

		generator.writeKey("leases");
		generator.writeStartArray();
		for (ShardLease item0 : this.leases) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardRetentionLeases}.
	 */
	public static class Builder implements ObjectBuilder<ShardRetentionLeases> {
		private Number primaryTerm;

		private Number version;

		private List<ShardLease> leases;

		/**
		 * API name: {@code primary_term}
		 */
		public Builder primaryTerm(Number value) {
			this.primaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code leases}
		 */
		public Builder leases(List<ShardLease> value) {
			this.leases = value;
			return this;
		}

		/**
		 * API name: {@code leases}
		 */
		public Builder leases(ShardLease... value) {
			this.leases = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #leases(List)}, creating the list if needed.
		 */
		public Builder addLeases(ShardLease value) {
			if (this.leases == null) {
				this.leases = new ArrayList<>();
			}
			this.leases.add(value);
			return this;
		}

		/**
		 * Set {@link #leases(List)} to a singleton list.
		 */
		public Builder leases(Function<ShardLease.Builder, ObjectBuilder<ShardLease>> fn) {
			return this.leases(fn.apply(new ShardLease.Builder()).build());
		}

		/**
		 * Add a value to {@link #leases(List)}, creating the list if needed.
		 */
		public Builder addLeases(Function<ShardLease.Builder, ObjectBuilder<ShardLease>> fn) {
			return this.addLeases(fn.apply(new ShardLease.Builder()).build());
		}

		/**
		 * Builds a {@link ShardRetentionLeases}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardRetentionLeases build() {

			return new ShardRetentionLeases(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ShardRetentionLeases
	 */
	public static final JsonpDeserializer<ShardRetentionLeases> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardRetentionLeases::setupShardRetentionLeasesDeserializer);

	protected static void setupShardRetentionLeasesDeserializer(
			DelegatingDeserializer<ShardRetentionLeases.Builder> op) {

		op.add(Builder::primaryTerm, JsonpDeserializer.numberDeserializer(), "primary_term");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");
		op.add(Builder::leases, JsonpDeserializer.arrayDeserializer(ShardLease.DESERIALIZER), "leases");

	}

}
