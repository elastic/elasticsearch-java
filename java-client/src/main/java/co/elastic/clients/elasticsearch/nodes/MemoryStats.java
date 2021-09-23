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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes._types.MemoryStats
public class MemoryStats implements JsonpSerializable {
	@Nullable
	private final String resident;

	@Nullable
	private final Number residentInBytes;

	@Nullable
	private final String share;

	@Nullable
	private final Number shareInBytes;

	@Nullable
	private final String totalVirtual;

	@Nullable
	private final Number totalVirtualInBytes;

	private final Number totalInBytes;

	private final Number freeInBytes;

	private final Number usedInBytes;

	// ---------------------------------------------------------------------------------------------

	public MemoryStats(AbstractBuilder<?> builder) {

		this.resident = builder.resident;
		this.residentInBytes = builder.residentInBytes;
		this.share = builder.share;
		this.shareInBytes = builder.shareInBytes;
		this.totalVirtual = builder.totalVirtual;
		this.totalVirtualInBytes = builder.totalVirtualInBytes;
		this.totalInBytes = Objects.requireNonNull(builder.totalInBytes, "total_in_bytes");
		this.freeInBytes = Objects.requireNonNull(builder.freeInBytes, "free_in_bytes");
		this.usedInBytes = Objects.requireNonNull(builder.usedInBytes, "used_in_bytes");

	}

	/**
	 * API name: {@code resident}
	 */
	@Nullable
	public String resident() {
		return this.resident;
	}

	/**
	 * API name: {@code resident_in_bytes}
	 */
	@Nullable
	public Number residentInBytes() {
		return this.residentInBytes;
	}

	/**
	 * API name: {@code share}
	 */
	@Nullable
	public String share() {
		return this.share;
	}

	/**
	 * API name: {@code share_in_bytes}
	 */
	@Nullable
	public Number shareInBytes() {
		return this.shareInBytes;
	}

	/**
	 * API name: {@code total_virtual}
	 */
	@Nullable
	public String totalVirtual() {
		return this.totalVirtual;
	}

	/**
	 * API name: {@code total_virtual_in_bytes}
	 */
	@Nullable
	public Number totalVirtualInBytes() {
		return this.totalVirtualInBytes;
	}

	/**
	 * API name: {@code total_in_bytes}
	 */
	public Number totalInBytes() {
		return this.totalInBytes;
	}

	/**
	 * API name: {@code free_in_bytes}
	 */
	public Number freeInBytes() {
		return this.freeInBytes;
	}

	/**
	 * API name: {@code used_in_bytes}
	 */
	public Number usedInBytes() {
		return this.usedInBytes;
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

		if (this.resident != null) {

			generator.writeKey("resident");
			generator.write(this.resident);

		}
		if (this.residentInBytes != null) {

			generator.writeKey("resident_in_bytes");
			generator.write(this.residentInBytes.doubleValue());

		}
		if (this.share != null) {

			generator.writeKey("share");
			generator.write(this.share);

		}
		if (this.shareInBytes != null) {

			generator.writeKey("share_in_bytes");
			generator.write(this.shareInBytes.doubleValue());

		}
		if (this.totalVirtual != null) {

			generator.writeKey("total_virtual");
			generator.write(this.totalVirtual);

		}
		if (this.totalVirtualInBytes != null) {

			generator.writeKey("total_virtual_in_bytes");
			generator.write(this.totalVirtualInBytes.doubleValue());

		}

		generator.writeKey("total_in_bytes");
		generator.write(this.totalInBytes.doubleValue());

		generator.writeKey("free_in_bytes");
		generator.write(this.freeInBytes.doubleValue());

		generator.writeKey("used_in_bytes");
		generator.write(this.usedInBytes.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MemoryStats}.
	 */
	public static class Builder extends MemoryStats.AbstractBuilder<Builder> implements ObjectBuilder<MemoryStats> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MemoryStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MemoryStats build() {

			return new MemoryStats(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private String resident;

		@Nullable
		private Number residentInBytes;

		@Nullable
		private String share;

		@Nullable
		private Number shareInBytes;

		@Nullable
		private String totalVirtual;

		@Nullable
		private Number totalVirtualInBytes;

		private Number totalInBytes;

		private Number freeInBytes;

		private Number usedInBytes;

		/**
		 * API name: {@code resident}
		 */
		public BuilderT resident(@Nullable String value) {
			this.resident = value;
			return self();
		}

		/**
		 * API name: {@code resident_in_bytes}
		 */
		public BuilderT residentInBytes(@Nullable Number value) {
			this.residentInBytes = value;
			return self();
		}

		/**
		 * API name: {@code share}
		 */
		public BuilderT share(@Nullable String value) {
			this.share = value;
			return self();
		}

		/**
		 * API name: {@code share_in_bytes}
		 */
		public BuilderT shareInBytes(@Nullable Number value) {
			this.shareInBytes = value;
			return self();
		}

		/**
		 * API name: {@code total_virtual}
		 */
		public BuilderT totalVirtual(@Nullable String value) {
			this.totalVirtual = value;
			return self();
		}

		/**
		 * API name: {@code total_virtual_in_bytes}
		 */
		public BuilderT totalVirtualInBytes(@Nullable Number value) {
			this.totalVirtualInBytes = value;
			return self();
		}

		/**
		 * API name: {@code total_in_bytes}
		 */
		public BuilderT totalInBytes(Number value) {
			this.totalInBytes = value;
			return self();
		}

		/**
		 * API name: {@code free_in_bytes}
		 */
		public BuilderT freeInBytes(Number value) {
			this.freeInBytes = value;
			return self();
		}

		/**
		 * API name: {@code used_in_bytes}
		 */
		public BuilderT usedInBytes(Number value) {
			this.usedInBytes = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MemoryStats}
	 */
	public static final JsonpDeserializer<MemoryStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MemoryStats::setupMemoryStatsDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupMemoryStatsDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::resident, JsonpDeserializer.stringDeserializer(), "resident");
		op.add(AbstractBuilder::residentInBytes, JsonpDeserializer.numberDeserializer(), "resident_in_bytes");
		op.add(AbstractBuilder::share, JsonpDeserializer.stringDeserializer(), "share");
		op.add(AbstractBuilder::shareInBytes, JsonpDeserializer.numberDeserializer(), "share_in_bytes");
		op.add(AbstractBuilder::totalVirtual, JsonpDeserializer.stringDeserializer(), "total_virtual");
		op.add(AbstractBuilder::totalVirtualInBytes, JsonpDeserializer.numberDeserializer(), "total_virtual_in_bytes");
		op.add(AbstractBuilder::totalInBytes, JsonpDeserializer.numberDeserializer(), "total_in_bytes");
		op.add(AbstractBuilder::freeInBytes, JsonpDeserializer.numberDeserializer(), "free_in_bytes");
		op.add(AbstractBuilder::usedInBytes, JsonpDeserializer.numberDeserializer(), "used_in_bytes");

	}

}
